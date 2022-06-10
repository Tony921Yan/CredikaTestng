package com.meiji.biz.request.http.mall.groupBuy

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindDefaultGroupBuyActiveGoods extends MallPost{
    {
        super.api = "groupBuy/findDefaultGroupBuyActiveGoods"
       super.params = [ ]
    }

    FindDefaultGroupBuyActiveGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindDefaultGroupBuyActiveGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindDefaultGroupBuyActiveGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }

}
