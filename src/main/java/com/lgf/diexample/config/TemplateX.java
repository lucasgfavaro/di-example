package com.lgf.diexample.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TemplateX implements Template {

    private final String user;

    public TemplateX(@Value("x") String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Template{" +
                "user='" + user + '\'' +
                '}';
    }
}
