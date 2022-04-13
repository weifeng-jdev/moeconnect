package com.amano.moe.core.redis.config;

import com.amano.moe.core.redis.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @Description
 * @ClassName RedisAutoConfiguration
 * @Author 卫峰
 * @date 2022.04.13 15:13
 */
@Slf4j
@Configuration
@AutoConfigureAfter(RedisConfig.class)
public class RedisAutoConfiguration implements InitializingBean {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public void afterPropertiesSet() throws Exception {
        RedisUtil.redisTemplate = redisTemplate;
    }
}
