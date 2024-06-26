package com.credika.biz.request.http.mall.groupBuy

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindGroupBuyActiveGoods extends MallPost{
    {
        super.api = "groupBuy/findGroupBuyActiveGoods"
        super.params = [ "condition","order","page","rows","sort"]
    }


    FindGroupBuyActiveGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindGroupBuyActiveGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindGroupBuyActiveGoods baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }

}
