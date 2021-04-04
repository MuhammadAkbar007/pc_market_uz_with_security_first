package uz.pdp.pc_market_uz_with_security_first.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()

                .antMatchers(HttpMethod.PUT, "/api/product/*").hasAnyRole("operator", "moderator")
                .antMatchers(HttpMethod.POST, "/api/product/*").hasAnyRole("operator", "moderator")
                .antMatchers(HttpMethod.GET, "/api/product/**").hasRole("operator")
                .antMatchers("/api/order/**").hasRole("operator")
                .antMatchers("/api/**").hasRole("admin")

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("SUPER_ADMIN").password(passwordEncoder().encode("admin123")).roles("admin")

                .and()

                .withUser("MODERATOR").password(passwordEncoder().encode("moderator123")).roles("moderator")

                .and()

                .withUser("OPERATOR").password(passwordEncoder().encode("operator123")).roles("operator");
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
