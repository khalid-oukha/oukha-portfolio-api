package com.oukha.portfolio.api;

import org.springframework.boot.SpringApplication;

public class TestOukhaPortfolioApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(OukhaPortfolioApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
