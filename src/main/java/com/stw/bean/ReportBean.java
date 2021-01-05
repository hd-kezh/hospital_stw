package com.stw.bean;

/**
 * Created by kezh
 * function: 病理报告
 * Date : 2021-01-05
 * Time : 14:12
 */
public class ReportBean {
    //报告单编号
    private String report_number;
    //患者Id
    private String patient_id;
    //患者记忆信息
    private String pati_info;
    //就诊类型
    private String visit_type;
    //就诊流水号
    private String serial_number;
    //对应的申请单编号
    private String application_form_number;
    //对应的申请单名称
    private String application_form_name;
    //申请日期
    private String application_date;
    //出报告时间
    private String report_time;
    //报告科室-编号
    private String report_department_id;
    //报告科室-名称
    private String report_department_name;
    //报告医师-工号
    private String report_doctor_id;
    //报告医师-姓名
    private String report_doctor_name;
//    //申请单名称
//    private String application_form_name;
//    //申请日期
//    private String application_date;
    //申请医师-工号
    private String application_doctor_id;
    //申请医师-姓名
    private String application_doctor_name;
    //标本名称
    private String sample_name;
    //临床诊断
    private String clinical_diagnoses;
    //肉眼所见
    private String nacked_findings;
    //镜下所见
    private String mirror_findings;
    //免疫荧光
    private String immu_result;
    //文字报告内容
    private String report_text;
    //病理诊断
    private String pathology_diagnoses;
}
