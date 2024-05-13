package com.credika.biz.request.http.mall.integral

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class SignRemindSetting extends MallPost{
    {
        super.api = "integral/signRemindSetting"
        super.params=["shopId","isSignRemindSetting"]
    }

    SignRemindSetting invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    SignRemindSetting baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
