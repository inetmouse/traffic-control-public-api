package com.cabonline.traffic.control.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.GenericFilterBean;

import javax.inject.Named;

@Configuration
public class SecurityConfig {

    @Bean
    public FilterRegistrationBean jwtFilter(@Named("filter") GenericFilterBean jwtFilter) {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(jwtFilter);
        registrationBean.addUrlPatterns("/api/*");

        return registrationBean;
    }
}