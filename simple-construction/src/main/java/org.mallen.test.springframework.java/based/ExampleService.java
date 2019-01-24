package org.mallen.test.springframework.java.based;

import javax.annotation.Resource;

/**
 * Created by mallen on 1/9/17.
 */
public class ExampleService {
    @Resource
    private ExampleDao exampleDao;

    @Resource
    private NotBeanAnnotationDao notBeanAnnotationDao;

    public ExampleDao getExampleDao() {
        return exampleDao;
    }

    public NotBeanAnnotationDao getNotBeanAnnotationDao() {
        return notBeanAnnotationDao;
    }
}
