package com.credika.biz.request.http.mall.integral
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SignIn extends MallPost{
    {
        super.api = "integral/signIn"
        super.params=["userId"]
    }

    SignIn invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    SignIn baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
