package com.credika.biz.request.http.mall.groupBuy
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
class GetRecommendGroupGoods extends MallPost{
    {
        super.api = "active/getRecommendGroupGoods"
       super.params = ["activityId","spuId"]
    }

    GetRecommendGroupGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetRecommendGroupGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetRecommendGroupGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
