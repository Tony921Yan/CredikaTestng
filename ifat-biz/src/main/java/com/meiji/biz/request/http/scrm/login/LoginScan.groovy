package com.meiji.biz.request.http.scrm.login


import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-9:28
 */
class LoginScan extends ScrmPost{
    {
        super.api = "scrm/login/loginScan"
        super.params=["authCode","state"]
    }

    @Override
    ScrmPost specialAssert(TestContext testContext) {
        assert testContext.getResponse().code == "05008"    //没办法获取企微auth_code 后续在优化
    }
}
