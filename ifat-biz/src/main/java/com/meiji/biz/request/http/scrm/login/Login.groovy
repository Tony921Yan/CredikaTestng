package com.meiji.biz.request.http.scrm.login

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-9:28
 */
class Login extends ScrmPost{
    {
        super.api = "scrm/login"
        super.params=["password","phone","verifyCode"]
    }

    @Override
    ScrmPost specialAssert(TestContext testContext) {
        assert testContext.getResponse().code == "500" //一期不支持账号密码登录，后续补充
    }
}
