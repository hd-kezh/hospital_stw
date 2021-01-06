package com.stw.config;

import com.stw.interceptor.InputParamCheckInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author kezh
 * @function ����������
 * @date 2020/12/30 15:41
 */
//@Configuration //ע��򿪾ͻ�������õ�������
public class ParamCheckConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //ע�ᶨ���������
        InterceptorRegistration registration = registry.addInterceptor(new InputParamCheckInterceptor());
        //����·����������
        registration.addPathPatterns("/**");
//        registration.excludePathPatterns(                         //��Ӳ�����·��
//                "/**/list",            //list�ӿ�
//        );
    }
}
