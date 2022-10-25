package com.lgf.diexample.service;

import com.lgf.diexample.repository.Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    Repository repositoryAxTemplate;
    Repository repositoryAyTemplate;
    Repository repositoryBxTemplate;
    Repository repositoryByTemplate;

    public ServicesConfiguration(
            Repository repositoryAxTemplate,
            Repository repositoryAyTemplate,
            Repository repositoryBxTemplate,
            Repository repositoryByTemplate
    ) {
        this.repositoryAxTemplate = repositoryAxTemplate;
        this.repositoryAyTemplate = repositoryAyTemplate;
        this.repositoryBxTemplate = repositoryBxTemplate;
        this.repositoryByTemplate = repositoryByTemplate;
    }

    @Bean("serviceAxTemplate")
    public ServiceA ServiceAxTemplate() {
        return new ServiceA(repositoryAxTemplate, repositoryBxTemplate, new ServiceB(repositoryAxTemplate, repositoryBxTemplate));
    }

    @Bean("serviceAyTemplate")
    public ServiceA ServiceAyTemplate() {
        return new ServiceA(repositoryAyTemplate, repositoryByTemplate,new ServiceB(repositoryAyTemplate, repositoryByTemplate));
    }

    @Bean("serviceBxTemplate")
    public ServiceB ServiceBxTemplate() {
        return new ServiceB(repositoryAxTemplate, repositoryBxTemplate);
    }

    @Bean("serviceByTemplate")
    public ServiceB ServiceByTemplate() {
        return new ServiceB(repositoryAyTemplate, repositoryByTemplate);
    }

}
