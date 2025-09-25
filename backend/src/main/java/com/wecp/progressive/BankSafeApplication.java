package com.wecp.progressive;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
// @EnableJpaRepositories("com.wecp.progressive.repository")
@EntityScan("com.wecp.progressive.entity")
public class BankSafeApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to BankSafe Project!");
    }
}
