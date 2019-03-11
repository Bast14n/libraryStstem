package pl.bast14n.librarysystem.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build());
        manager.createUser(User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build());
        return manager;
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception{
//        http
//                .csrf().disable()
//                .exceptionHandling()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login/admin").hasRole("ADMIN")
//                .antMatchers("/login/user").hasRole("USER")
//                .and()
//                .logi
//                .and()
//                .logout();
//                    }
}
