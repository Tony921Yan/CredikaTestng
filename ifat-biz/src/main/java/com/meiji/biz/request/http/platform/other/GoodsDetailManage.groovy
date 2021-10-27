package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GoodsDetailManage extends PlatformPost {
    {
        super.api = "GoodsDetailManage/getGoodsByPage"
        super.params =  [ "groupType","pageNum","pageSize","searchTestGoods"]
    }

    GoodsDetailManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GoodsDetailManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GoodsDetailManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GoodsDetailManage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 3
        return this
    }
}
