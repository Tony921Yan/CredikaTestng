package com.meiji.biz.request.http.mall.groupBuy

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupBuyTopGoods extends MallPost{
    {
        super.api = "groupBuy/getGroupBuyTopGoods"
       super.params = [ ]
    }

    GetGroupBuyTopGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupBuyTopGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupBuyTopGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
