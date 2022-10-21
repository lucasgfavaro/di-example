package com.lgf.diexample.service;

import com.lgf.diexample.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ServiceA {

    private static final Logger log = LoggerFactory.getLogger(ServiceA.class);
    private final String name = "ServiceA";
    private final Repository repositoryA;
    private final Repository repositoryB;

    public ServiceA(
            Repository repositoryA,
            Repository repositoryB) {
        this.repositoryA = repositoryA;
        this.repositoryB = repositoryB;
    }

    public String getName() {
        return name;
    }

    public Repository getRepositoryA() {
        return repositoryA;
    }

    public Repository getRepositoryB() {
        return repositoryB;
    }

    @Override
    public String toString() {
        return "ServiceA{" +
                "hash='" + Integer.toHexString(System.identityHashCode(this)) + '\'' +
                "name='" + name + '\'' +
                ", repositoryA=" + repositoryA +
                ", repositoryB=" + repositoryB +
                '}';
    }

}
