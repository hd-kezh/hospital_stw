package com.stw.domain;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author kezh
 * @function
 * @date 2020/12/29 13:59
 */
public class Rsp {

    //成功标识
    @JsonProperty(value = "success")
    private boolean success;
    //错误码
    @JsonProperty(value = "error_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int errorCode;
    //错误描述
    @JsonProperty(value = "error_msg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMsg;
    //成功时返回的数据
    @JsonProperty(value = "data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private JSONArray data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public JSONArray getData() {
        return data;
    }

    public void setData(JSONArray data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * 返回成功
     * @param success
     * @param data
     */
    public Rsp(boolean success, JSONArray data) {
        this.success = success;
        this.data = data;
    }

    /**
     * 返回失败
     * @param success
     * @param errorCode
     * @param errorMsg
     */
    public Rsp(boolean success, int errorCode, String errorMsg) {
        this.success = success;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Rsp() {

    }

}
