//package com.example.spirngsecurityoauth2server.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//
//
//@Configuration
//@EnableAuthorizationServer//开启认证服务器
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    // 注入 WebSecurityConfiguration 中配置的 BCryptPasswordEncoder
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//    //对客户端授权: 登录成功后 认证服务器会给客户端分配授权码
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients
//                .inMemory()//从内存中获取
//                .withClient("client")//clientId
//                .secret(passwordEncoder.encode("secret"))//客户端安全码
//                .authorizedGrantTypes("authorization_code")//授权模式，密码，客户端，简单，授权码
//                .scopes("app")//授权范围
//                .redirectUris("http://www.funtl.com");//获取授权码的回调服务器地址
//    }
//}
