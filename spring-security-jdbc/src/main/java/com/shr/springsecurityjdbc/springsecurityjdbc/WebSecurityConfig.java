package com.shr.springsecurityjdbc.springsecurityjdbc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@ComponentScan("com.shr.springsecurityjdbc.springsecurityjdbc")  
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean    
	public UserDetailsService userDetailsService() {    
	    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();    
	    manager.createUser(User.withDefaultPasswordEncoder()  
	    .username("shrishti").password("shri123").roles("ADMIN").build());    
	    return manager;    
	}    
	    
	@Override    
	protected void configure(HttpSecurity http) throws Exception {    
	        
	      http.authorizeRequests().  
	      antMatchers("/index", "/user","/").permitAll()  
	      .antMatchers("/admin").authenticated()  
	      .and()  
	      .formLogin()  
	      .loginPage("/login")  
	      .and()  
	      .logout()  
	      .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));  
	}    
}
