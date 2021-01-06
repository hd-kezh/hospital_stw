package com.stw.controller.patient;

import com.alibaba.fastjson.JSONObject;
import com.stw.domain.Rsp;
import com.stw.domain.RspCode;
import com.stw.service.PatientService;
import com.stw.util.ValidatorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * ������ؽӿ�
 */
@Slf4j
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

//    /**
//     * ���ݽ���ʱ���ȡ���л�����Ϣ
//     * @return
//     */
//    @RequestMapping(value="list",method = RequestMethod.GET)
//    @ResponseBody
//    public String getPatientListInfo(@RequestParam(value = "begin_date", required = true)String startDate,
//                                         @RequestParam(value = "end_date", required = true)String endDate){
//        return patientService.getPatientListInfo(startDate, endDate);
//    }

//    /**
//          * ���ݽ���ʱ���ȡ���л�����Ϣ
//          * @return
//          */
//    @RequestMapping(value="list",method = RequestMethod.GET)
//    @ResponseBody
//    public String getPatientListInfo(@RequestParam(value = "begin_date", required = true)String startDate,
//                                         @RequestParam(value = "end_date", required = true)String endDate){
//        return patientService.getPatientListInfo(startDate, endDate);
//    }


//    /**
//     * ���ݻ��߿��Ż�ȡ������Ϣ
//     * @return
//     */
//    @RequestMapping(value="/ssss",method = RequestMethod.GET)
//    @ResponseBody
//    public String getPatientbyCardNumber(@RequestParam(value = "id_card_number", required = false)String cardNum){
//        return patientService.getPatientbyCardNumber(cardNum);
//    }

    /**
     * ���ݽ���ʱ���ȡ���л�����Ϣ
     * @return
     */
    @RequestMapping(value="list",method = RequestMethod.GET)
    @ResponseBody
    public Rsp getPatientListInfo(HttpServletRequest request){
        Rsp rsp = ValidatorUtil.check(new String[]{"begin_date", "end_date"}, request);
        if(rsp!=null){
            return rsp;
        }
        return patientService.getPatientListInfo(request.getParameter("begin_date"), request.getParameter("end_date"));
    }

    /**
     * ���ݻ��߿��Ż�ȡ������Ϣ
     * @return
     */
    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
//    public Rsp getPatientbyCardNumber(@RequestParam(value = "id_card_number", required = false)String cardNum){
    public Rsp getPatientbyCardNumber(HttpServletRequest request){
        Rsp rsp = ValidatorUtil.check(new String[]{"id_card_number"},request);
        if(rsp!=null){
            return rsp;
        }
        log.info("");
        return patientService.getPatientbyCardNumber(request.getParameter("id_card_number"));
    }

}
