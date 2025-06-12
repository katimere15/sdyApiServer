package com.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.spring.interceptor.RouterInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    // WebMvcConfigurer 인터페이스를 구현하여 Spring MVC 설정을 커스터마이징할 수 있습니다.
    // 예: 인터셉터 등록, 뷰 리졸버 설정 등

    // 예시로 인터셉터를 등록하는 메서드
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RouterInterceptor())
                .addPathPatterns("/**"); // 모든 경로에 대해 인터셉터 적용
    }
    
}
