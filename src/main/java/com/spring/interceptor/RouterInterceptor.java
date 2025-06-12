package com.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

/*
 * RouterInterceptor.java
 * 요청이 컨트롤러에 도달하기 전에 실행되는 인터셉터
 * 이 인터셉터는 요청을 가로채고, 필요한 경우 요청을 수정하거나 추가 작업을 수행할 수 있습니다.
 * 예를 들어, 인증, 로깅, 요청 수정 등을 처리할 수 있습니다.
 */
@Slf4j
public class RouterInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 요청을 가로채고 필요한 작업을 수행합니다.
        // 예: 인증 체크, 로깅 등
        System.out.println("요청! Request intercepted: " + request.getRequestURI());

        // true를 반환하면 다음 인터셉터나 컨트롤러로 요청이 전달됩니다.
        // false를 반환하면 요청 처리가 중단됩니다.
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, 
                           org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        // 컨트롤러가 요청을 처리한 후에 실행됩니다.
        // 예: 응답 수정, 추가 데이터 설정 등
        // System.out.println("응답! Post handle: " + request.getRequestURI());
    }
    
}
