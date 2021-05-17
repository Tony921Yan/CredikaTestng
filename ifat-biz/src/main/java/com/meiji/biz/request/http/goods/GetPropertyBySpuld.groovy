package com.meiji.biz.request.http.goods

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class GetPropertyBySpuld extends MeijiRequest{
    {
        super.api = "/platform/goodsMgr/getPropertyBySpuId"
        super.params = ["spuId"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
