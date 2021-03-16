package com.learning.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
public class Config {
//    @Bean
//    public LettuceConnectionFactory redisConnectionFactory() {
//        LettuceConnectionFactory lcf = new LettuceConnectionFactory();
//        lcf.setHostName("your_host_name_or_ip");
//        lcf.setPort(6379);
//        lcf.afterPropertiesSet();
//        return lcf;
//    }
}
