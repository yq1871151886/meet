package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
public class MeetOrganizationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetOrganizationApiApplication.class, args);
    }

}
