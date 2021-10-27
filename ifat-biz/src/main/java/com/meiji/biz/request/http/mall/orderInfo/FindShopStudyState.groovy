package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class FindShopStudyState extends ShopPost {
    {
        super.api = "extraInfo/findShopStudyState"
        super.params =  ["id"]
    }

    FindShopStudyState invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopStudyState preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopStudyState baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
