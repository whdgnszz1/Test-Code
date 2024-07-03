package com.example.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@ConfigurationProperties(prefix = "spring.mail")
@Data
public class MailProperties {
    private String host;
    private int port;
    private String username;
    private String password;
    private final Properties properties = new Properties();
}
