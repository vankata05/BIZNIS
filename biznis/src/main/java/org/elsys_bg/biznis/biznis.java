package org.elsys_bg.biznis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class biznis{
    public static void main(String[] args){
        SpringApplication.run(biznis.class, args);
    }
}