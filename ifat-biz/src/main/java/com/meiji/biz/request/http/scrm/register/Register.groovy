package com.meiji.biz.request.http.scrm.register

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-11:13
 */
class Register extends ScrmPost{
    {
        super.api = "scrm/register"
        super.params = ["phone", "legalPerson", "name", "mailAddress"]
    }
}
