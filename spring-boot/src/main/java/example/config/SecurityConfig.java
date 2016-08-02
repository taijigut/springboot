package example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http		.authorizeRequests().antMatchers("/").permitAll()
			.and()	.authorizeRequests().antMatchers("/console/**").permitAll()
			.and()	.authorizeRequests().antMatchers(HttpMethod.DELETE).denyAll();
		
		
		
		
		http.csrf().disable();
		
		http.headers().frameOptions().disable();
	}
}
