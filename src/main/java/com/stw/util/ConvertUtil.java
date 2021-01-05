package com.stw.util;

import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Created by kezh
 * function: 类型转换工具类
 * Date : 2021-01-05
 * Time : 10:44
 */
public class ConvertUtil {

    /**
     *
     * Map转String
     * @param map
     * @return
     */
    public static String getMapToString(Map<String,Object> map){
        Set<String> keySet = map.keySet();
        //将set集合转换为数组
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        //给数组排序(升序)
        Arrays.sort(keyArray);
        //因为String拼接效率会很低的，所以转用StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            // 参数值为空，则不参与签名 这个方法trim()是去空格
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
     * String转map
     * @param str
     * @return
     */
    public static Map<String,Object> getStringToMap(String str){
        //根据逗号截取字符串数组
        String[] str1 = str.split(",");
        //创建Map对象
        Map<String,Object> map = new HashMap<>();
        //循环加入map集合
        for (int i = 0; i < str1.length; i++) {
            //根据":"截取字符串数组
            String[] str2 = str1[i].split(":");
            //str2[0]为KEY,str2[1]为值
            map.put(str2[0],str2[1]);
        }
        return map;
    }

    /**
     *
     *@Title:  ListToArray
     *@Description: list列表转换成二维数组
     *@Author: Administrator
     *@Since: 2018年1月7日下午2:01:25
     *@param: @param list
     *@param: @param KeyLenght每行的列数，按最长的计算
     *@param: @return
     *@return Object[][]
     */
    public static Object[][] ListToArray(List<Map<String, Object>> list, int KeyLenght) {
        if (CollectionUtils.isEmpty(list)) {
            return new Object[0][];
        }
        int size = list.size();
        Object[][] array = new Object[size][KeyLenght];
        for (int i = 0; i < size; i++) {//循环遍历所有行
            array[i] = list.get(i).values().toArray();//每行的列数
        }
        return array;
    }

}
