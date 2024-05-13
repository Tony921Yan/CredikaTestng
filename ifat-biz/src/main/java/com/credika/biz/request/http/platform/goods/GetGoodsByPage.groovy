package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsByPage extends PlatformPost{
    {
        super.api = "GoodsDetailManage/getGoodsByPage"
        super.params = ["categoryId","endDate","endNum","endPrice","pageNum","pageSize","skuCode","spuCodeAndName","startDate",
                         "startNum","startPrice"]
    }

    GetGoodsByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGoodsByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
