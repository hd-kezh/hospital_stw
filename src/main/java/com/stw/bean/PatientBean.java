package com.stw.bean;

/**
 * 患者
 */
public class PatientBean {
    //患者Id（患者在院内系统中的唯一编码，用于血透系统患者与院内系统患者进行对应，以下patient_id同）
    private String patient_id;
    //患者姓名
    private String patient_name;
    //性别
    private String sex;
    //出生日期
    private String date_of_birth;
    //身份证号
    private String id_card_number;
    //自费标识
    private String self_supporting_flag;
    //医疗保险类别
    private String medical_insurance_type;
    //医保卡号
    private String medical_insurance_code;
    //军官证号
    private String officer_certificate_number;
    //护照号
    private String passport_number;
    //患者电话
    private String patient_phone_number;
    //健康档案编号
    private String health_record_number;
    //ABO血型
    private String blood_type;
    //Rh血型
    private String rh_blood_type;
    //婚姻状况
    private String marital_status;
    //民族
    private String nationality;
    //出生地
    private String birth_place;
    //籍贯
    private String native_place;
    //学历
    private String education;
    //学位
    private String dgree;
    //职业类别
    private String occupation_type;
    //工作单位名称
    private String work_unit_name;
    //工作单电话
    private String work_unit_phone_number;
    //联系人姓名
    private String contact_person_name;
    //联系人电话
    private String contact_person_phone_number;
    //联系人与患者关系
    private String contact_person_relationship;

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        this.id_card_number = id_card_number;
    }

    public String getSelf_supporting_flag() {
        return self_supporting_flag;
    }

    public void setSelf_supporting_flag(String self_supporting_flag) {
        this.self_supporting_flag = self_supporting_flag;
    }

    public String getMedical_insurance_type() {
        return medical_insurance_type;
    }

    public void setMedical_insurance_type(String medical_insurance_type) {
        this.medical_insurance_type = medical_insurance_type;
    }

    public String getMedical_insurance_code() {
        return medical_insurance_code;
    }

    public void setMedical_insurance_code(String medical_insurance_code) {
        this.medical_insurance_code = medical_insurance_code;
    }

    public String getOfficer_certificate_number() {
        return officer_certificate_number;
    }

    public void setOfficer_certificate_number(String officer_certificate_number) {
        this.officer_certificate_number = officer_certificate_number;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public String getPatient_phone_number() {
        return patient_phone_number;
    }

    public void setPatient_phone_number(String patient_phone_number) {
        this.patient_phone_number = patient_phone_number;
    }

    public String getHealth_record_number() {
        return health_record_number;
    }

    public void setHealth_record_number(String health_record_number) {
        this.health_record_number = health_record_number;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getRh_blood_type() {
        return rh_blood_type;
    }

    public void setRh_blood_type(String rh_blood_type) {
        this.rh_blood_type = rh_blood_type;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        this.native_place = native_place;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDgree() {
        return dgree;
    }

    public void setDgree(String dgree) {
        this.dgree = dgree;
    }

    public String getOccupation_type() {
        return occupation_type;
    }

    public void setOccupation_type(String occupation_type) {
        this.occupation_type = occupation_type;
    }

    public String getWork_unit_name() {
        return work_unit_name;
    }

    public void setWork_unit_name(String work_unit_name) {
        this.work_unit_name = work_unit_name;
    }

    public String getWork_unit_phone_number() {
        return work_unit_phone_number;
    }

    public void setWork_unit_phone_number(String work_unit_phone_number) {
        this.work_unit_phone_number = work_unit_phone_number;
    }

    public String getContact_person_name() {
        return contact_person_name;
    }

    public void setContact_person_name(String contact_person_name) {
        this.contact_person_name = contact_person_name;
    }

    public String getContact_person_phone_number() {
        return contact_person_phone_number;
    }

    public void setContact_person_phone_number(String contact_person_phone_number) {
        this.contact_person_phone_number = contact_person_phone_number;
    }

    public String getContact_person_relationship() {
        return contact_person_relationship;
    }

    public void setContact_person_relationship(String contact_person_relationship) {
        this.contact_person_relationship = contact_person_relationship;
    }

    @Override
    public String toString() {
        return "PatientBean{" +
                "patient_id='" + patient_id + '\'' +
                ", patient_name='" + patient_name + '\'' +
                ", sex='" + sex + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", id_card_number='" + id_card_number + '\'' +
                ", self_supporting_flag='" + self_supporting_flag + '\'' +
                ", medical_insurance_type='" + medical_insurance_type + '\'' +
                ", medical_insurance_code='" + medical_insurance_code + '\'' +
                ", officer_certificate_number='" + officer_certificate_number + '\'' +
                ", passport_number='" + passport_number + '\'' +
                ", patient_phone_number='" + patient_phone_number + '\'' +
                ", health_record_number='" + health_record_number + '\'' +
                ", blood_type='" + blood_type + '\'' +
                ", rh_blood_type='" + rh_blood_type + '\'' +
                ", marital_status='" + marital_status + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birth_place='" + birth_place + '\'' +
                ", native_place='" + native_place + '\'' +
                ", education='" + education + '\'' +
                ", dgree='" + dgree + '\'' +
                ", occupation_type='" + occupation_type + '\'' +
                ", work_unit_name='" + work_unit_name + '\'' +
                ", work_unit_phone_number='" + work_unit_phone_number + '\'' +
                ", contact_person_name='" + contact_person_name + '\'' +
                ", contact_person_phone_number='" + contact_person_phone_number + '\'' +
                ", contact_person_relationship='" + contact_person_relationship + '\'' +
                '}';
    }
}
