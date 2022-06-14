package com.meiji.biz.request.http.mall.newVip

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetActivityGoods extends MallPost{
    {
        super.api = "newVip/getActivityGoods"
       super.params = [ "page","rows"]
    }

    GetActivityGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActivityGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActivityGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
