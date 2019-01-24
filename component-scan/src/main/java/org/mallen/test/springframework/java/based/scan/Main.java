package org.mallen.test.springframework.java.based.scan;

import org.mallen.test.springframework.java.based.scan.basepackage.ExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.mallen.test.springframework.java.based.scan.config.ScanAppConfig;

/**
 * Created by mallen on 1/9/17.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScanAppConfig.class);
//
//        ExampleService service = applicationContext.getBean(ExampleService.class);
//        LOGGER.debug("service = {}", service);
//        LOGGER.debug("service.dao = {}", service.getExampleDao());
//
//        applicationContext.registerShutdownHook();

        Thread t = new Thread();
        System.out.println(t.isDaemon());
    }
}
