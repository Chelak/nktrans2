package com.nktrans.configuration;

import com.nktrans.configuration.security.SecuritySuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by scelac on 8/11/16.
 */

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    @Qualifier("authenticationProvider")
    DaoAuthenticationProvider authenticationProvider;

    @Autowired
    SecuritySuccessHandler securitySuccessHandler;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/", "/login").permitAll()
                .antMatchers("/home").authenticated()
                .antMatchers("/admin").access("hasRole('ADMIN')")
                .and().formLogin().failureUrl("/login?error").successHandler(securitySuccessHandler)
                .loginPage("/login")
                .usernameParameter("email").passwordParameter("password")
                .and().csrf()
                .and().exceptionHandling().accessDeniedPage("/access_denied");
    }
}
