package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetPropertyBySpuld extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/getPropertyBySpuId"
        super.params = ["spuId"]
    }

    GetPropertyBySpuld invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetPropertyBySpuld preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetPropertyBySpuld baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
