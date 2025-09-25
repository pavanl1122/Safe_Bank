package com.wecp.progressive;

import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
// @EnableJpaRepositories("com.wecp.progressive.repository")
@EntityScan("com.wecp.progressive.entity")
=======

@SpringBootApplication
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252
public class BankSafeApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to BankSafe Project!");
    }
}
