package com.lgf.diexample.resource;

import com.lgf.diexample.service.ServiceA;
import com.lgf.diexample.service.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/resourceA")
public class ResourceA {

    private static final Logger log = LoggerFactory.getLogger(ResourceA.class);
    private final ServiceA serviceA;
    private final ServiceB serviceB;

    public ResourceA(ServiceA serviceAyTemplate, ServiceB serviceByTemplate) {
        this.serviceA = serviceAyTemplate;
        this.serviceB = serviceByTemplate;
    }

    @GetMapping()
    public void get() {
        log.info(serviceA.toString());
        log.info(serviceB.toString());
    }
}
