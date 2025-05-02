package com.example.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Rene
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")  // Permite o frontend no localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);  // Isso pode ser importante se você estiver usando cookies ou autenticação via credenciais
    }

}