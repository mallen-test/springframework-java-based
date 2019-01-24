package org.mallen.test.springframework.java.based.scan.basepackage;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mallen on 1/9/17.
 */
@Service
public class ExampleService {
    @Resource
    private ExampleDao exampleDao;

    public ExampleDao getExampleDao() {
        return exampleDao;
    }
}
