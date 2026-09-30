package com.manab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "MANAB TECHNOLOGIES LTD - Live DevOps Training Center";
    }

    @GetMapping("/courses")
    public String courses() {
        return "DevOps, Docker, Kubernetes, AWS, Linux, Terraform, Ansible, Monitoring";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
