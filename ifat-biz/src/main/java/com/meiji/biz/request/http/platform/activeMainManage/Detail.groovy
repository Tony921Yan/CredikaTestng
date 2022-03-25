package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Detail extends PlatformPost{
    {
        super.api = "activeMainManage/detail"
       super.params = ["id"]
    }

    Detail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Detail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Detail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
