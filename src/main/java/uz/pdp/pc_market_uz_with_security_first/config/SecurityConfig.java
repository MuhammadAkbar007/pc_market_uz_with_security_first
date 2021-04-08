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

                .antMatchers(HttpMethod.PUT, "/api/product/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                .antMatchers(HttpMethod.POST, "/api/product/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                .antMatchers(HttpMethod.GET, "/api/product/**").hasAnyRole("SUPER_ADMIN", "OPERATOR", "MODERATOR")
                .antMatchers(HttpMethod.DELETE, "/api/product/**").hasRole("SUPER_ADMIN")
                .antMatchers("/api/order/**").hasAnyRole("OPERATOR", "SUPER_ADMIN")
                .antMatchers("/api/**").hasRole("SUPER_ADMIN")

                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("SUPER_ADMIN").password(passwordEncoder().encode("admin123")).roles("SUPER_ADMIN")

                .and()

                .withUser("MODERATOR").password(passwordEncoder().encode("moderator123")).roles("MODERATOR")

                .and()

                .withUser("OPERATOR").password(passwordEncoder().encode("operator123")).roles("OPERATOR");
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
