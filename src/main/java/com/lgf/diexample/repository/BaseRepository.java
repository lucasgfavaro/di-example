package com.lgf.diexample.repository;


import com.lgf.diexample.config.Template;

public class BaseRepository implements Repository {

    private final Template template;

    public BaseRepository(Template template) {
        this.template = template;
    }

    public Template getTemplate() {
        return template;
    }
}
