package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ProdGetGoodsByPage extends PlatformPost{
    {
        super.api = "/GoodsDetailManage/getGoodsByPage"
        super.params = ["pageNum","pageSize"]
    }

    ProdGetGoodsByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ProdGetGoodsByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ProdGetGoodsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
