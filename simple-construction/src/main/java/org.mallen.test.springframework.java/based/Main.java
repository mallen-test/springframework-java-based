package org.mallen.test.springframework.java.based;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试最基础的方式初始化（不使用@ComponentScan自动扫描bean）。
 * AnnotationConfigApplicationContext既可以输入@Configuration classes，并且还可以输入被@Component或者JSR330（@Named和@ManagedBean）标注了的类，
 * 甚至于输入没有被任何注解标注的类。
 *
 * <p>
 * Created by mallen on 1/9/17.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class, NotBeanAnnotationDao.class);

        ExampleService service = applicationContext.getBean(ExampleService.class);

        LOGGER.debug("service = {}", service);
        LOGGER.debug("dao = {}", service.getExampleDao());

        NotBeanAnnotationDao anotherDao = applicationContext.getBean(NotBeanAnnotationDao.class);
        LOGGER.debug("not bean annotation dao = {}", anotherDao);
        LOGGER.debug("service.notAnnotationDao = {}", service.getNotBeanAnnotationDao());

        applicationContext.registerShutdownHook();
    }
}
