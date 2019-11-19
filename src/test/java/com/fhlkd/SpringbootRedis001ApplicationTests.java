package com.fhlkd;

import com.fhlkd.entity.User;
import com.fhlkd.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class SpringbootRedis001ApplicationTests {

    @Autowired
    RedisUtil redisUtil;
    @Test
    void contextLoads() {
       /* redisUtil.opsForValue().set("test","123");
        System.out.println(redisUtil.opsForValue().get("test"));*/

        redisUtil.set("test","1221");
        System.out.println(redisUtil.get("test"));

        User user  = new User();
        user.setCreateTIme(new Date());
        user.setName("诸葛");
        user.setPassword("asdaadafa");
        redisUtil.set("user",user);
        User userTo = (User)redisUtil.get("user");
        System.out.println(userTo);
    }


}
