package com.imranshafqat.coderbyteproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.imranshafqat.coderbyteproject.config.security.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class CoderByteProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoderByteProjectApplication.class, args);
    }

}
