//package com.example.spirngsecurityoauth2server.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)//开启方法级别的注解
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    /*
//        @EnableGlobalMethodSecurity
//        可选参数：prePostEnabled的Pre和Post注解是否可用。即@PreAuthorize和@PostAuthorize
//                  secureEnabled: Spring Security的@Secured 注解是否可用
//                  jsr250Enabled: Spring Security对JSR-250的注解是否可用
//        一般我们只会用到@PreAuthorize注解会在进入方法前进行权限验证
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//    */
//
//    /*
//    这里注意必须要加密实例放入IOC容器，
//    虽然在内存中的用户密码可以解密，
//    不然在获取令牌的时候，客户端的安全码不能解密
//     */
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        /*
//        inMemoryAuthentication 从内存中获取  对内存中的密码进行Bcrypt编码加密
//          */
//        auth.inMemoryAuthentication().
//                passwordEncoder(passwordEncoder()).
//                withUser("zht").
//                password(
//                        passwordEncoder().
//                                encode("123456")).
//                roles("USER");
//        auth.inMemoryAuthentication().
//                passwordEncoder(new BCryptPasswordEncoder()).
//                withUser("admin").
//                password(
//                        new BCryptPasswordEncoder().
//                                encode("123456")).
//                roles("admin","USER");
//
//        //更换从数据库获取权限信息 Security 5 以后必须对密码进行加密
//        //auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//    }
//
//    /*
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/css/**","/index").permitAll()
//                .antMatchers("/user/**").hasRole("USER")
//                .antMatchers("/blogs/**").hasRole("USER")
//                .and()
//                .formLogin().loginPage("/login").failureForwardUrl("/login-error")
//                .and()
//                .exceptionHandling().accessDeniedPage("/401");
//        http.logout().logoutSuccessUrl("/");
//        http.formLogin().successForwardUrl("/index");
//    }
//    */
//}
