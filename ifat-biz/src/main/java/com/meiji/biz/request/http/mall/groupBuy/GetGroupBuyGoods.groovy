package com.meiji.biz.request.http.mall.groupBuy

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupBuyGoods extends MallPost{
    {
        super.api = "active/getGroupBuyGoods"
       super.params = ["page","rows"]
    }

    GetGroupBuyGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupBuyGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupBuyGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
