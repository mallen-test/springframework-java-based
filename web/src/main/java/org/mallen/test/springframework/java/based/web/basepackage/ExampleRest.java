package org.mallen.test.springframework.java.based.web.basepackage;

/**
 * Created by mallen on 1/9/17.
 */
public class ExampleRest {
    private ExampleDao exampleDao;

    public ExampleDao getExampleDao() {
        return exampleDao;
    }

    public void setExampleDao(ExampleDao exampleDao) {
        this.exampleDao = exampleDao;
    }
}
