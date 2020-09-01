package com.leo.afbaselibrary.nets.entities;

import com.google.gson.JsonElement;

/**
 * created by czh on 16/12/5 10:15
 * email：1632365610@qq.com
 */
public class BBDResultEntity {
    private int code;
    private String msg;
    private JsonElement data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}
