package com.czh.mytest.nets;

import com.blankj.utilcode.util.AppUtils;

/**
 * @Created By Admin  on 2020/9/27
 * @Email : 163235610@qq.com
 * @Author:Mrczh
 * @Instructions:
 */
public class Net {
    String domainReleaseName ="http://api.juheapi.com/japi/toh";
    String domainDebugName = "http://api.juheapi.com/japi/toh";

    String baseUrl = AppUtils.isAppDebug() ? domainDebugName : domainReleaseName;



}
