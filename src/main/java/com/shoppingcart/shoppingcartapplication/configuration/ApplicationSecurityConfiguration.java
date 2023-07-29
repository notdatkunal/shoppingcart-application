package com.shoppingcart.shoppingcartapplication.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.*;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class ApplicationSecurityConfiguration  {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        		.csrf(csrf->csrf.disable())
                .authorizeHttpRequests((auth) -> {
                		auth.requestMatchers("/*","/login/**","/signup/**").permitAll();
                        auth.anyRequest().authenticated();}
                )
                .httpBasic(withDefaults());
                

        return http.build();
    }


}
