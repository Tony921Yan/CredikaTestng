package com.meiji.biz.request.http.platform.goodsDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CheckSpusIsOnlyGift extends PlatformPost{
    {
        super.api = "GoodsDetailManage/checkSpusIsOnlyGift"
       super.params = ["spuId"]
    }

    CheckSpusIsOnlyGift invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckSpusIsOnlyGift preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckSpusIsOnlyGift baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
