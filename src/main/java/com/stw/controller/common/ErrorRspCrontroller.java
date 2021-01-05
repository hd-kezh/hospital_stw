package com.stw.controller.common;

import com.stw.domain.Rsp;
import com.stw.domain.RspCode;
import com.stw.util.ConvertUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by kezh
 * function: 资源访问错误映射
 * Date : 2021-01-05
 * Time : 9:54
 */
@Slf4j
@RestController
@RequestMapping("/")
public class ErrorRspCrontroller extends AbstractErrorController {

    public ErrorRspCrontroller(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @RequestMapping(value="/error", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Rsp handleError(HttpServletRequest request){
        Map<String, Object> errorAttributes = super.getErrorAttributes(request, true);
        String status = errorAttributes.containsKey("status") ? String.valueOf(errorAttributes.get("status")) : "200";
//        String error = errorAttributes.containsKey("error") ? (String)errorAttributes.get("error"):"not define";
////        String message = errorAttributes.containsKey("message") ? (String)errorAttributes.get("message"):"No message available";
//        String trace = errorAttributes.containsKey("trace") ? (String)errorAttributes.get("trace"):"no trace";
//        String path = errorAttributes.containsKey("path") ? (String)errorAttributes.get("path"):"no path";
        Rsp rsp = new Rsp();
        rsp.setSuccess(false);
        //4xx 请求错误的
        if(status.substring(0,1).equals("4")){
            rsp.setErrorCode(RspCode.RSPCODE_0.getErrorCode());
            rsp.setErrorMsg(RspCode.RSPCODE_0.getErrorMsg() + "，具体错误信息：" + ConvertUtil.getMapToString(errorAttributes));
        }else if (status.substring(0,1).equals("5")){ //5xx 服务器错误
            rsp.setErrorCode(RspCode.RSPCODE_4.getErrorCode());
            rsp.setErrorMsg(RspCode.RSPCODE_4.getErrorMsg() + "，具体错误信息：" + ConvertUtil.getMapToString(errorAttributes));
        }else {//其他除2xx 成功的其他错误信息
            rsp.setErrorCode(RspCode.RSPCODE_5.getErrorCode());
            rsp.setErrorMsg(RspCode.RSPCODE_5.getErrorMsg() + "，具体错误信息：" + ConvertUtil.getMapToString(errorAttributes));
        }

        return rsp;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
