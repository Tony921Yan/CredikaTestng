package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupGoodsByPage extends PlatformPost{
    {
        super.api = "GoodsDetailManage/getGoodsByPage"
        super.params = ["categoryId","endDate","endNum","endPrice","pageNum","pageSize","skuCode","spuCodeAndName","startDate",
                         "startNum","startPrice","groupType"]
    }

    GetGroupGoodsByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupGoodsByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupGoodsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGroupGoodsByPage specialAssert(TestContext testContext){//组合商品较少，暂时取2个
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 2
        return this
    }
}
