package com.example.finalcasestudy.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 
@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Autowired
	DataSource dataSource;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
 
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("select user_name,password,enabled from user where user_name=?")
				.authoritiesByUsernameQuery("select user_name, role from user_roles where user_name=?");
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//	 http.authorizeRequests().antMatchers("/", "/home").permitAll().antMatchers("/admin").hasRole("admin")
//	 .anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout()
//	 .permitAll();

//	 http.authorizeRequests().antMatchers("/users").hasRole("admin").anyRequest().authenticated();
//	 http.csrf().disable().formLogin();
//	 http.exceptionHandling().accessDeniedPage("/403");
//	 .and().formLogin().loginPage("/login").permitAll().and().logout();
//	 .antMatchers(HttpMethod.POST, "/users/**").hasRole("admin").antMatchers(HttpMethod.PUT, "/users/**")
//	 .hasRole("admin").antMatchers(HttpMethod.PATCH, "/users/**").hasRole("admin")
//	 .antMatchers(HttpMethod.DELETE, "/users/**").hasRole("admin").and().csrf().disable().formLogin();
	 

	http.authorizeRequests().anyRequest().authenticated();
	http.csrf().disable().formLogin();
	http.exceptionHandling().accessDeniedPage("/403");
	}
}
