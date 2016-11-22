package com.wscq.domain.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by monst on 2016/11/18.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
