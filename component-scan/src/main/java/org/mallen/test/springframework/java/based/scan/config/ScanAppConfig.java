package org.mallen.test.springframework.java.based.scan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mallen on 1/9/17.
 */
@Configuration
@ComponentScan("org.mallen.test.springframework.java.based.scan.basepackage")
public class ScanAppConfig {
}
