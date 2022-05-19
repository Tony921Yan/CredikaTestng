package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class Add extends PlatformPost{
    {
        super.api = "ActiveMainManage/add"
        super.params = ["expiryEnd","expiryStart","name","preTime","raffleActivity","status","type"]
    }

    Add invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Add preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Add baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
