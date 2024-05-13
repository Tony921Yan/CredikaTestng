package com.credika.biz.request.http.mall.groupBuy

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupBuyActive extends MallPost{
    {
        super.api = "groupBuy/getGroupBuyActive"
       super.params = [ ]
    }

    GetGroupBuyActive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupBuyActive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupBuyActive baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
