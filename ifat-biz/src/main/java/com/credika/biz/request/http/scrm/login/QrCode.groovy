package com.credika.biz.request.http.scrm.login


import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/20-9:28
 */
class QrCode extends ScrmGet{
    {
        super.api = "scrm/login/qrCode"  //前端接口
        super.params=["loginType"]
    }



}
