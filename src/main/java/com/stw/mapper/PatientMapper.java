package com.stw.mapper;

import com.stw.bean.PatientBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @author kezh
 * @function
 * @date 2020/12/29 10:34
 */
@Mapper
public interface PatientMapper {

    public List<PatientBean> queryByCardNum(String cardNum);

    public List<PatientBean> queryAllPatientByDate(Date startDate, Date endDate);

}
