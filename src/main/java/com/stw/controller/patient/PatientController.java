package com.stw.controller.patient;

import com.alibaba.fastjson.JSONObject;
import com.stw.domain.Rsp;
import com.stw.domain.RspCode;
import com.stw.domain.ServiceRequestMap;
import com.stw.domain.ServiceResponseMsg;
import com.stw.service.PatientService;
import com.stw.util.ValidatorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 患者相关接口
 */
@Slf4j
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

//    /**
//     * 根据建档时间获取所有患者信息
//     * @return
//     */
//    @RequestMapping(value="list",method = RequestMethod.GET)
//    @ResponseBody
//    public String getPatientListInfo(@RequestParam(value = "begin_date", required = true)String startDate,
//                                         @RequestParam(value = "end_date", required = true)String endDate){
//        return patientService.getPatientListInfo(startDate, endDate);
//    }

    /**
          * 根据建档时间获取所有患者信息
          * @return
          */
    @RequestMapping(value="list",method = RequestMethod.GET)
    @ResponseBody
    public String getPatientListInfo(@RequestParam(value = "begin_date", required = true)String startDate,
                                         @RequestParam(value = "end_date", required = true)String endDate){
        return patientService.getPatientListInfo(startDate, endDate);
    }

    /**
     * 根据患者卡号获取患者信息
     * @return
     */
    @RequestMapping(value="/comm",method = RequestMethod.GET)
    @ResponseBody
    public ServiceResponseMsg getPatientbyCardNumber(@RequestBody ServiceRequestMap serviceRequestMap){
        return patientService.getPatientbyCardNumber(serviceRequestMap);
    }

//    /**
//     * 根据患者卡号获取患者信息
//     * @return
//     */
//    @RequestMapping(value="/ssss",method = RequestMethod.GET)
//    @ResponseBody
//    public String getPatientbyCardNumber(@RequestParam(value = "id_card_number", required = false)String cardNum){
//        return patientService.getPatientbyCardNumber(cardNum);
//    }


    /**
     * 根据患者卡号获取患者信息
     * @return
     */
    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
//    public Rsp getPatientbyCardNumber(@RequestParam(value = "id_card_number", required = false)String cardNum){
    public Rsp getPatientbyCardNumber(HttpServletRequest request){
//        Rsp rsp = new Rsp();
//        if(cardNum == null){
//            rsp.setSuccess(false);
//            rsp.setErrorMsg(RspCode.RSPCODE_1.getErrorMsg());
//            rsp.setErrorCode(RspCode.RSPCODE_1.getErrorCode());
////            return "请求参数id_card_number未传，或者拼写有误";
//            return rsp;
//        }
        Rsp rsp = ValidatorUtil.check(new String[]{"id_card_number"},request);
        if(rsp!=null){
            return rsp;
        }
        return patientService.getPatientbyCardNumber(request.getParameter("id_card_number"));
    }

}
