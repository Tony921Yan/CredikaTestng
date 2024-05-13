package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetPageSupervisor extends PlatformPost{
    {
        super.api = "GoodsDetailManage/getPageSupervisor"
        super.params = []
    }

    GetPageSupervisor invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetPageSupervisor preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetPageSupervisor baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
