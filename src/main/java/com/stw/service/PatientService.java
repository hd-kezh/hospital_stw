package com.stw.service;

import com.alibaba.fastjson.JSON;
import com.stw.bean.PatientBean;
import com.stw.domain.Rsp;
import com.stw.domain.RspCode;
import com.stw.domain.ServiceRequestMap;
import com.stw.domain.ServiceResponseMsg;
import com.stw.mapper.PatientMapper;
import com.stw.util.ValidatorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author kezh
 * @function
 * @date 2020/12/28 15:05
 */
@Slf4j
@Service
public class PatientService {

    @Resource
    private PatientMapper patientMapper;

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 根据建档时间获取所有患者信息
     *
     * @return
     */
    public String getPatientListInfo(String startDate, String endDate) {
        Rsp rsp = new Rsp();
        ParsePosition pos = new ParsePosition(8);
        List<PatientBean> patientBeanList = patientMapper.queryAllPatientByDate(formatter.parse(startDate, pos), formatter.parse(endDate, pos));
//        JSONObject rsp = new JSONObject();
        List<Map> patientList = new ArrayList<>();
        for (PatientBean patientBean : patientBeanList) {
            Map patientMap = new HashMap();
            patientMap.put("id_card_number", patientBean.getId_card_number());
            patientMap.put("patient_id", patientBean.getPatient_id());
            patientList.add(patientMap);
        }
        rsp.setData(JSON.toJSONString(patientList));
        rsp.setSuccess(true);
//        Map rspMap = new HashMap();
//        rspMap.put("rsp",rsp);
        return rsp.toString();
    }

//    /**
//     * 根据患者卡号获取患者信息
//     * @return
//     */
//    public String getPatientbyCardNumber(String cardNumber){
//        List<PatientBean> patientBeanList = patientMapper.queryByCardNum(cardNumber);
//        List<Map> patientList = new ArrayList<>();
//        for(PatientBean patientBean : patientBeanList ){
//            Map patientMap = new HashMap();
//            patientMap.put("id_card_number",patientBean.getId_card_number());
//            patientMap.put("patient_id",patientBean.getPatient_id());
//            patientList.add(patientMap);
//        }
//
//        return JSON.toJSONString(patientList);
//
//    }

    /**
     * 根据患者卡号获取患者信息
     *
     * @return
     */
    public Rsp getPatientbyCardNumber(String cardNumber) {
        Rsp rsp = new Rsp();
        List<PatientBean> patientBeanList = patientMapper.queryByCardNum(cardNumber);
        List<Map> patientList = new ArrayList<>();
        if (!patientBeanList.isEmpty()) {
            rsp.setSuccess(true);
//            rsp.setErrorCode("null");
//            rsp.setErrorMsg("null");
        } else {
            rsp.setSuccess(false);
            rsp.setErrorCode(RspCode.RSPCODE_5.getErrorCode());
            rsp.setErrorMsg("未查询到任何信息");
            return rsp;
        }
        for (PatientBean patientBean : patientBeanList) {
            Map patientMap = new HashMap();
            patientMap.put("id_card_number", patientBean.getId_card_number());
            patientMap.put("patient_id", patientBean.getPatient_id());
            patientList.add(patientMap);
        }
        rsp.setData(JSON.toJSONString(patientList));

        return rsp;

    }


    public ServiceResponseMsg getPatientbyCardNumber(ServiceRequestMap requestBody) {
        //校验入参
//        ValidatorUtil.check(requestBody,new String[]{"id_card_number"});
        List<PatientBean> patientBeanList = patientMapper.queryByCardNum("");
        List<Map> patientList = new ArrayList<>();
        for (PatientBean patientBean : patientBeanList) {
            Map patientMap = new HashMap();
            patientMap.put("id_card_number", patientBean.getId_card_number());
            patientMap.put("patient_id", patientBean.getPatient_id());
            patientList.add(patientMap);
        }

        return null;

    }

}
