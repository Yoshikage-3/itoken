package com.funtl.itoken.service.redis.service;

/**
 * @author Administrator
 */
public interface RedisService {
    /**
     *
     * @param key
     * @param value
     * @param seconds
     */
    void put(String key,Object value,long seconds);

    /**
     *
     * @param key
     */
    Object get(String key);
}
