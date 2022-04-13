package com.amano.moemanga;

import com.amano.moe.core.redis.util.RedisUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.amano.moemanga.dao")
public class MoeMangaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoeMangaApplication.class, args);
    }

}
