package com.trj.dubbo.providers.service;

import com.trj.dubbo.api.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author TRJ
 * @date 2019/10/29
 * Description:
 */
@Slf4j
@Service
public class AnnotationServiceImpl implements IDemoService {
    @Override
    public String sayHello(String param) {
        log.info("接受到远程调用：{}", param);
        return "annotation: hello, " + param;
    }
}
