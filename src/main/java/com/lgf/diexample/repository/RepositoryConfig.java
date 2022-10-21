package com.lgf.diexample.repository;

import com.lgf.diexample.config.TemplateX;
import com.lgf.diexample.config.TemplateY;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean("repositoryAxTemplate")
    public BaseRepository repositoryAxTemplate(TemplateX template) {
        return new RepositoryA(template);
    }

    @Bean("repositoryAyTemplate")
    public BaseRepository repositoryAyTemplate(TemplateY template) {
        return new RepositoryA(template);
    }

    @Bean("repositoryBxTemplate")
    public BaseRepository repositoryBxTemplate(TemplateX template) {
        return new RepositoryB(template);
    }

    @Bean("repositoryByTemplate")
    public BaseRepository repositoryByTemplate(TemplateY template) {
        return new RepositoryB(template);
    }

}
