package com.credika.biz.request.http.OMS.user


import com.miyuan.ifat.support.test.TestContext

class CheckGrayUser extends com.credika.biz.request.http.OMS.OMSPost{
    {
        super.api = "user/checkGrayUser"
        super.params =  ["grayUserId"]
    }

    CheckGrayUser invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    CheckGrayUser baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
