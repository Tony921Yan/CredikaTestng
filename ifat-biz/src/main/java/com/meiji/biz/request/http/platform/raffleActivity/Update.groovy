package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Update extends PlatformPost{
    {
        super.api = "ActiveMainManage/update"
       super.params = ["expiryEnd","expiryStart","name","preTime","raffleActivity","status","type","id"]
    }

    Update invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Update preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Update baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
