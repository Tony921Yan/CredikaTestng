package com.meiji.biz.request.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ListOrderAfterLog extends MallPost {
    {
        super.api = "/orderAfterSale/listOrderAfterLog"
        super.params =  ["afterCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ListOrderAfterLog invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListOrderAfterLog preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListOrderAfterLog baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
