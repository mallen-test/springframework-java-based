package org.mallen.test.springframework.java.based.web.basepackage;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mallen on 1/9/17.
 */
public class ExampleService {
    private ExampleDao exampleDao;

    public void setExampleDao(ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }

    public ExampleDao getExampleDao() {
        return exampleDao;
    }
}
