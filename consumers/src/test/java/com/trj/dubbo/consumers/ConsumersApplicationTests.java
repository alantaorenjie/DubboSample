package com.trj.dubbo.consumers;

import com.trj.dubbo.consumers.action.AnnotationAction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumersApplicationTests {

    @Autowired
    AnnotationAction annotationAction;

    @Test
    void contextLoads() throws InterruptedException {
        annotationAction.doSayHello("ggggggggggggggggggggggggggggggggggg");
    }

}
