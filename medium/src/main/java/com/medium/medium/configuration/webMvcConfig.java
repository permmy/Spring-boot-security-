package com.medium.medium.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by permmy on 17/05/17.
 */

@Configuration
public class webMvcConfig extends WebMvcConfigurerAdapter{

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
