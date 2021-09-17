package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdGetGoodsByPage extends PlatformPost{
    {
        super.api = "/GoodsDetailManage/getGoodsByPage"
        super.params = ["pageNum","pageSize"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
