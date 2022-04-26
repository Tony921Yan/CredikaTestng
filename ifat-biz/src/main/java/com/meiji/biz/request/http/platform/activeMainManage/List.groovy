package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class List extends PlatformPost{
    {
        super.api = "activeMainManage/list"
       super.params = ["type","page","rows","status","name","expiryEnd","expiryStart","id","typeList","statusList"]
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
