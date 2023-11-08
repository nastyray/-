package com.ray.usercenter.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * ClassName: RedisTest
 * Package: com.ray.usercenter.service
 * Description:
 *
 * @Author lil ray
 * @Create 2023/11/7 20:51
 * @Version 1.0
 */
@SpringBootTest
public class RedisTest {
    @Resource
    private RedisTemplate redisTemplate;

    @Test
    public void test(){

    }
}
