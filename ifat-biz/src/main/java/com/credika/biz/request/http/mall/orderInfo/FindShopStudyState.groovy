package com.credika.biz.request.http.mall.orderInfo


import com.miyuan.ifat.support.test.TestContext

class FindShopStudyState extends com.credika.biz.request.http.shop.ShopPost {
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
