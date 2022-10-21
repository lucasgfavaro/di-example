package com.lgf.diexample.repository;

import com.lgf.diexample.config.Template;

public class RepositoryB extends BaseRepository {

    private final String name = "repositoryB";

    public RepositoryB(Template template) {
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
        return "RepositoryB{" +
                "hash='" + Integer.toHexString(System.identityHashCode(this)) + '\'' +
                "name='" + name + '\'' +
                ", template=" + this.getTemplate() +
                '}';
    }
}
