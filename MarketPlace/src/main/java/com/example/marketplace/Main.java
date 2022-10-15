package com.example.marketplace;

import com.example.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

    @Autowired
    ProductRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
