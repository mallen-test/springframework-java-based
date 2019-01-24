package org.mallen.test.springframework.java.based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mallen on 1/9/17.
 */
@Configuration
public class AppConfig {
    @Bean
    public ExampleService exampleService() {
        return new ExampleService();
    }

    @Bean
    public ExampleDao exampleDao() {
        return new ExampleDao();
    }
}
