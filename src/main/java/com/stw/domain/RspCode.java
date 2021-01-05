package com.stw.domain;

/**
 * @author kezh
 * @function 定义所有的错误返回码
 * @date 2020/12/29 14:01
 */
public enum RspCode {

    RSPCODE_0(0, "请求地址无效"),
    RSPCODE_1(1, "请求参数无效"),
    RSPCODE_2(2, "接口程序内部错误"),
    RSPCODE_4(4, "网络或服务器故障"),
    RSPCODE_5(5, "其他情况");

    private int errorCode;
    private String errorMsg;

    RspCode(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
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
}
