package com.stw.service;

import com.stw.STWApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by kezh
 * Date : 2021-01-06
 * Time : 11:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = STWApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class PatientServiceTest {

    @Resource
    PatientService patientService;

    @Test
    public void listPatientTest(){

        System.out.println((patientService.getPatientbyCardNumber("111").toString()));
    }

}
