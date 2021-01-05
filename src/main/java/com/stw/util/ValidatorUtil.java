package com.stw.util;

import com.stw.domain.Rsp;
import com.stw.domain.RspCode;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

/**
 * @author kezh
 * @function
 * @date 2020/12/29 16:16
 */
public class ValidatorUtil {

    //字符串转日期格式
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    //校验请求入参是否满足要求
    public static Rsp check(String[] fields, HttpServletRequest servletRequest) {
        Rsp rsp = new Rsp();
        for (String field : fields) {
            //校验字段名字和值是否为空
            if (checkField(field, servletRequest)) {
                //校验字段格式
                if(!checkFieldType(field, servletRequest)){
                    rsp.setSuccess(false);
                    rsp.setErrorCode(RspCode.RSPCODE_1.getErrorCode());
                    rsp.setErrorMsg("请求中字段" + servletRequest.getParameter(field) + "类型有误");
                    return rsp;
                }
            }else{
                rsp.setSuccess(false);
                rsp.setErrorCode(RspCode.RSPCODE_1.getErrorCode());
                rsp.setErrorMsg("请求中必传字段" + field +"没传,或者" + field + "字段的值为空");
                return rsp;
            }
        }
        //校验报错返回 错误描述，验证通过返回空对象
        return null;
    }

    //校验入参字段名和值是否为空
    public static boolean checkField(String field, HttpServletRequest request) {
        if(request.getParameter(field)==null || request.getParameter(field).equals("")){
            return false;
        }
        return true;
    }

    //校验入参字段类型，暂时不需要，判断字符串，整形，日期等类型
    public static boolean checkFieldType(String field, HttpServletRequest request) {

        return true;
    }
}
