package com.aaa.ssm.util;

import redis.clients.jedis.Jedis;

/**
 * fileName:TestRedisConnect
 * description:
 * author:zyj
 * createTime:2019/3/2 17:36
 */
public class TestRedisConnect {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.198.25",6379);
     System.out.println(jedis.ping());
    }
}
