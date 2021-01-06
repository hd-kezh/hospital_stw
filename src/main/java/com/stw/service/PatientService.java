package com.stw.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.stw.bean.PatientBean;
import com.stw.domain.Rsp;
import com.stw.domain.RspCode;
import com.stw.mapper.PatientMapper;
import com.stw.util.ConvertUtil;
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

//    /**
//     * ���ݽ���ʱ���ȡ���л�����Ϣ
//     *
//     * @return
//     */
//    public String getPatientListInfo(String startDate, String endDate) {
//        Rsp rsp = new Rsp();
//        ParsePosition pos = new ParsePosition(8);
//        List<PatientBean> patientBeanList = patientMapper.queryAllPatientByDate(formatter.parse(startDate, pos), formatter.parse(endDate, pos));
////        JSONObject rsp = new JSONObject();
//        List<Map> patientList = new ArrayList<>();
//        for (PatientBean patientBean : patientBeanList) {
//            Map patientMap = new HashMap();
//            patientMap.put("id_card_number", patientBean.getId_card_number());
//            patientMap.put("patient_id", patientBean.getPatient_id());
//            patientList.add(patientMap);
//        }
//        rsp.setData(JSON.toJSONString(patientList));
//        rsp.setSuccess(true);
////        Map rspMap = new HashMap();
////        rspMap.put("rsp",rsp);
//        return rsp.toString();
//    }

    /**
     * ���ݽ���ʱ���ȡ���л�����Ϣ
     *
     * @return
     */
    public Rsp getPatientListInfo(String startDate, String endDate) {
        String []data;
        Rsp rsp = new Rsp();
        ParsePosition pos = new ParsePosition(8);
        List<PatientBean> patientBeanList = patientMapper.queryAllPatientByDate(formatter.parse(startDate, pos), formatter.parse(endDate, pos));
        List<Map> patientList = new ArrayList<>();
        if(!patientBeanList.isEmpty()){
            rsp.setSuccess(true);
        }else{
            rsp.setSuccess(false);
            rsp.setErrorCode(RspCode.RSPCODE_5.getErrorCode());
            rsp.setErrorMsg("�ý�������"+ startDate + " �� " + endDate + "�޲�ѯ��������Ϣ");
            return rsp;
        }
        for (PatientBean patientBean : patientBeanList) {
            Map patientMap = new HashMap();
            patientMap.put("id_card_number", patientBean.getId_card_number());
            patientMap.put("patient_id", patientBean.getPatient_id());
            patientList.add(patientMap);
        }
        rsp.setData(JSON.parseArray(JSON.toJSONString(patientList)));
        return rsp;
    }

//    /**
//     * ���ݻ��߿��Ż�ȡ������Ϣ
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
     * ���ݻ��߿��Ż�ȡ������Ϣ
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
            rsp.setErrorMsg("δ��ѯ���κ���Ϣ");
            return rsp;
        }
        for (PatientBean patientBean : patientBeanList) {
            Map patientMap = new HashMap();
            patientMap.put("id_card_number", patientBean.getId_card_number());
            patientMap.put("patient_id", patientBean.getPatient_id());
            patientList.add(patientMap);
        }
        //dataΪString
//        rsp.setData(JSON.toJSONString(patientList));
        //dataΪJSONArray����
        rsp.setData(JSON.parseArray(JSON.toJSONString(patientList)));
        return rsp;

    }

}
