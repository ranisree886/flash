package com.nisum.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@Configuration
public class SecurityConfiguration extends WebSecurityConfiguration{
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		.antMatchers("/register").permitAll()
		.antMatchers("/confirm").permitAll();
		
	}
	

}
