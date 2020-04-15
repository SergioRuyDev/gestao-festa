package com.sergioruy.festa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class InMemorySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder)
            throws Exception {
        builder
            .inMemoryAuthentication()
            .withUser("Sergio").password("{noop}123").roles("ADMIN")
            .and()
            .withUser("Andressa").password("{noop}456").roles("USER")
            .and()
            .withUser("Julia").password("{noop}789").roles("USER");
    }
}
