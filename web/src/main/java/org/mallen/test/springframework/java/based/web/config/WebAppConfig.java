package org.mallen.test.springframework.java.based.web.config;

import org.mallen.test.springframework.java.based.web.basepackage.ExampleDao;
import org.mallen.test.springframework.java.based.web.basepackage.ExampleRest;
import org.mallen.test.springframework.java.based.web.basepackage.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mallen on 1/9/17.
 */
@Configuration
@ComponentScan("org.mallen.test.springframework.java.based.web.basepackage")
public class WebAppConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(WebAppConfig.class);

    /**
     * 通过参数获取exampleDao这个bean，与bean标签的<property/>属性ref类似，如果ref指定的bean不存在会报错，同样如果该参数对应的bean不存在，则也会报错说找不到对应的bean
     * @param exampleDao
     * @return
     */
    @Bean
    public ExampleRest exampleRest(ExampleDao exampleDao) {
        LOGGER.debug("exampleDao = {}", exampleDao);
        ExampleRest rest = new ExampleRest();
        rest.setExampleDao(exampleDao);
        return rest;
    }

    @Bean
    public ExampleService exampleService(ExampleDao exampleDao) {
        LOGGER.debug("exampleDao = {}", exampleDao);
        ExampleService service = new ExampleService();
        service.setExampleDao(exampleDao);

        return service;
    }


    // 下面三个方法用于测试inter-bean的用法，inter-bean只能在@Configuration中使用，不能在@Component中使用
    // 经过下方的三个方法的测试，可以得出的是：
    // 1、exampleDao1在被其他方法调用时，返回的是同一个对象，而不是像代码描述的一样，每次返回一个新new的对象
    // 2、@Bean产生的bean，默认的name为方法名，此处的exampleDao1与@Repository标注的ExampleDao不冲突，名称不一样（后者的名称默认为exampleDao）
    //

    @Bean
    public ExampleDao exampleDao1(){
        ExampleDao exampleDao1 = new ExampleDao();
        LOGGER.debug("exampleDao1 = {}", exampleDao1);

        return exampleDao1;
    }

    @Bean
    public ExampleRest exampleRest1(){
        ExampleRest exampleRest = new ExampleRest();
        exampleRest.setExampleDao(exampleDao1());

        LOGGER.debug("exampleRest1.exampleDao = {}", exampleRest.getExampleDao());

        return exampleRest;
    }

    @Bean
    public ExampleService exampleService1(){
        ExampleService exampleService = new ExampleService();
        exampleService.setExampleDao(exampleDao1());

        LOGGER.debug("exampleService1.exampleDao = {}", exampleService.getExampleDao());

        return exampleService;
    }
}
