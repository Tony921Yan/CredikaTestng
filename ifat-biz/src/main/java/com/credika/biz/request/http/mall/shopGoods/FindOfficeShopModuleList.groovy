package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindOfficeShopModuleList extends MallPost {
    {
        super.api = "/shopGoods/findOfficeShopModuleList"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindOfficeShopModuleList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindOfficeShopModuleList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindOfficeShopModuleList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    FindOfficeShopModuleList specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
