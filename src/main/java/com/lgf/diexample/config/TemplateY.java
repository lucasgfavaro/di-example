package com.lgf.diexample.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TemplateY implements Template {

    private final String user;

    public TemplateY(@Value("y") String user) {
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
