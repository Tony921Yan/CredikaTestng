package com.credika.biz.request.http.mall.orderAfterSale

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class PostReturnLogisticsInformation extends MallPost {
    {
        super.api = "/orderAfterSale/postReturnLogisticsInformation"
        super.params =  ["afterCode","goodsIdList","logisticsCode","logisticsCompanyCode","orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PostReturnLogisticsInformation invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PostReturnLogisticsInformation preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PostReturnLogisticsInformation baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
