package com.funtl.itoken.web.admin.service.fallback;

import com.funtl.itoken.web.admin.service.RedisService;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class RedisServiceFallback implements RedisService {

    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
