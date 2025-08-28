package com.wipro.auth.config;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
	 @Bean
	    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/hello")
	                .permitAll()
	                .anyRequest()
	                .authenticated())
	            .formLogin(withDefaults());
	            
	           // .formLogin(form->form.defaultSuccessUrl("/hello", true)) 
	            //.logout(logout->logout.logoutSuccessUrl("/hello"));
	        return http.build();
	    }

	    @Bean
	    UserDetailsService userDetailsService() {
	        UserDetails user=User.withUsername("jay")
	            .password(passwordEncoder().encode("pass"))
	            .build();

	        return new InMemoryUserDetailsManager(user);
	    }

	    @Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

}
