package com.stw.config;

import com.stw.interceptor.InputParamCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author kezh
 * @function 拦截器配置
 * @date 2020/12/30 15:41
 */
//@Configuration //注解打开就会加载配置的拦截器
public class ParamCheckConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册定义的拦截器
        InterceptorRegistration registration = registry.addInterceptor(new InputParamCheckInterceptor());
        //所有路径都被拦截
        registration.addPathPatterns("/**");
//        registration.excludePathPatterns(                         //添加不拦截路径
//                "/**/list",            //list接口
//        );
    }
}
