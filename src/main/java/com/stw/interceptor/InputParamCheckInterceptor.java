package com.stw.interceptor;

import com.stw.util.ValidatorUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author kezh
 * @function 参数拦截器：校验请求入参
 * @date 2020/12/30 15:38
 */
public class InputParamCheckInterceptor implements HandlerInterceptor {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("entry InputParamCheckInterceptor.preHandle .....");
//        String rspMsg = ValidatorUtil.check(request);
        String cardNum = request.getParameter("id_card_numbe");
        if(cardNum != null){
            return true;
        }
//        System.out.println(rspMsg);
        //如果设置为false时，被请求时，拦截器执行到此处将不会继续操作，当为true时，请求将会继续执行后面的操作
        System.out.println("exit InputParamCheckInterceptor.preHandle .....");
        return false;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("entry InputParamCheckInterceptor.postHandle .....");
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("entry InputParamCheckInterceptor.afterCompletion .....");
    }
}
