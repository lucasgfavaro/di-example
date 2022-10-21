package com.lgf.diexample.resource;

import com.lgf.diexample.service.ServiceA;
import com.lgf.diexample.service.ServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/resourceB")
public class ResourceB {

    private static final Logger log = LoggerFactory.getLogger(ResourceB.class);
    private final ServiceA serviceA;
    private final ServiceB serviceB;

    public ResourceB(ServiceA serviceAxTemplate, ServiceB serviceBxTemplate) {
        this.serviceA = serviceAxTemplate;
        this.serviceB = serviceBxTemplate;
    }

    @GetMapping()
    public void get() {
        log.info(serviceA.toString());
        log.info(serviceB.toString());
    }
}
