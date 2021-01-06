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

    //�ַ���ת���ڸ�ʽ
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    //У����������Ƿ�����Ҫ��
    public static Rsp check(String[] fields, HttpServletRequest servletRequest) {
        Rsp rsp = new Rsp();
        for (String field : fields) {
            //У���ֶ����ֺ�ֵ�Ƿ�Ϊ��
            if (checkField(field, servletRequest)) {
                //У���ֶθ�ʽ
                if(!checkFieldType(field, servletRequest)){
                    rsp.setSuccess(false);
                    rsp.setErrorCode(RspCode.RSPCODE_1.getErrorCode());
                    rsp.setErrorMsg("�������ֶ�" + servletRequest.getParameter(field) + "��������");
                    return rsp;
                }
            }else{
                rsp.setSuccess(false);
                rsp.setErrorCode(RspCode.RSPCODE_1.getErrorCode());
                rsp.setErrorMsg("�����бش��ֶ�" + field +"û��,����" + field + "�ֶε�ֵΪ��");
                return rsp;
            }
        }
        //У�鱨���� ������������֤ͨ�����ؿն���
        return null;
    }

    //У������ֶ�����ֵ�Ƿ�Ϊ��
    public static boolean checkField(String field, HttpServletRequest request) {
        if(request.getParameter(field)==null || request.getParameter(field).equals("")){
            return false;
        }
        return true;
    }

    //У������ֶ����ͣ���ʱ����Ҫ���ж��ַ��������Σ����ڵ�����
    public static boolean checkFieldType(String field, HttpServletRequest request) {

        return true;
    }
}
