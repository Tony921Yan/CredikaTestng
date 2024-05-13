package com.credika.biz.request.http.platform.member


import com.miyuan.ifat.support.test.TestContext

class UpdateUserInfo extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/Memeber/updateUserInfo"
        super.params = ["id","nickname","sex","birthday"]
    }

    UpdateUserInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateUserInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateUserInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
