package com.crisver.appatc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.crisver.appatc.Servicios.UsuarioAppMovilServiceIm;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	 @Autowired
	 private UsuarioAppMovilServiceIm usuarioAppMovilIm;
	 
	  @Override
	  @Bean
	  protected AuthenticationManager authenticationManager() throws Exception{
		  return super.authenticationManager();
	  }
	  
	  @Bean
	  public BCryptPasswordEncoder encoder() {
		  return new BCryptPasswordEncoder();
	  }
	  
	  @Override
	  protected void configure (AuthenticationManagerBuilder auth) throws Exception{
		  auth.userDetailsService(usuarioAppMovilIm).passwordEncoder(encoder());
		  
	  }
	  @Override
	  protected void configure(HttpSecurity http) throws Exception{
		  http
		  .authorizeRequests()
		  .antMatchers("/oauth/token").permitAll();
		  
	  }
}
