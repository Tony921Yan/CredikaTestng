package com.credika.biz.request.http.scrm.register

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/20-11:07
 */
class AuthResult extends ScrmGet{
    {
        super.api = "scrm/register/authResult"
        super.params = ["corpId"]
    }
}
