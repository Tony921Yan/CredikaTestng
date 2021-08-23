package com.meiji.biz.request.http.scrm.register

import com.meiji.biz.request.http.scrm.ScrmGet
import com.miyuan.ifat.support.test.TestContext

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
