package com.stw.util;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created by kezh
 * function: ����ת��������
 * Date : 2021-01-05
 * Time : 10:44
 */
public class ConvertUtil {

    /**
     *
     * MapתString
     * @param map
     * @return
     */
    public static String getMapToString(Map<String,Object> map){
        Set<String> keySet = map.keySet();
        //��set����ת��Ϊ����
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        //����������(����)
        Arrays.sort(keyArray);
        //��ΪStringƴ��Ч�ʻ�ܵ͵ģ�����ת��StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            // ����ֵΪ�գ��򲻲���ǩ�� �������trim()��ȥ�ո�
            if ((String.valueOf(map.get(keyArray[i]))).trim().length() > 0) {
                sb.append(keyArray[i]).append(":").append(String.valueOf(map.get(keyArray[i])).trim());
            }
            if(i != keyArray.length-1){
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /**
     *
     * Stringתmap
     * @param str
     * @return
     */
    public static Map<String,Object> getStringToMap(String str){
        //���ݶ��Ž�ȡ�ַ�������
        String[] str1 = str.split(",");
        //����Map����
        Map<String,Object> map = new HashMap<>();
        //ѭ������map����
        for (int i = 0; i < str1.length; i++) {
            //����":"��ȡ�ַ�������
            String[] str2 = str1[i].split(":");
            //str2[0]ΪKEY,str2[1]Ϊֵ
            map.put(str2[0],str2[1]);
        }
        return map;
    }

}
