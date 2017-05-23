package code.selwyn.configurer

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.annotation.web.builders.WebSecurity

/**
 * Created by Selwyn on 5/22/2017.
 */
@Configuration
@EnableWebSecurity
open class WebSecurityConfig constructor() : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity){
        web.ignoring().antMatchers("/js/**", "/css/**", "/img/**", "/webjars/**", "/scss/**", "/fonts/**", "/images/**")
    }


    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication().withUser("selwyn").password("selwyn").roles("user")
    }
    override fun configure(http: HttpSecurity) {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .usernameParameter("username")
                .defaultSuccessUrl("/index")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/logout")
                .deleteCookies("remember-me")
                .logoutSuccessUrl("/")
                .permitAll()
        http.csrf().disable()
        http.sessionManagement()
                .invalidSessionUrl("/login")
    }
}