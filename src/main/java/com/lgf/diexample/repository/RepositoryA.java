package com.lgf.diexample.repository;

import com.lgf.diexample.config.Template;

public class RepositoryA extends BaseRepository {

    private final String name = "repositoryA";

    public RepositoryA(Template template) {
        super(template);
    }

    public String getName() {
        return name;
    }

    public Template getTemplate() {
        return super.getTemplate();
    }

    @Override
    public String toString() {
        return "RepositoryA{" +
                "hash='" + Integer.toHexString(System.identityHashCode(this)) + '\'' +
                "name='" + name + '\'' +
                ", template=" + this.getTemplate() +
                '}';
    }


}
