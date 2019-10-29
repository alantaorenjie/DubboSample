package com.trj.dubbo.consumers.action;

import com.trj.dubbo.api.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author TRJ
 * @date 2019/10/29
 * Description:
 */
@Slf4j
@Component("annotationAction")
public class AnnotationAction {

    @Reference
    IDemoService annotationService;

    public void doSayHello(String name) {
        String str =  annotationService.sayHello(name);

        log.info(str);
    }
}
