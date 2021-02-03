package com.miyuan.request.api.goods

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest

class CenterSearch extends MiyuanRequest {
    {
        super.api = "/api/goods/center/search"
        super.params =  [ "itemSource", "keywords", "itemSouceIds", "coupon", "supplierCode","owner", "localMark",
                          "isSuperSubsidy", "shopType", "minId", "searchType"]
    }

    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanRequest afterInvoke(TestContext testContext){
        Map map = testContext.getResponse()
        testContext.put("itemSourceId",map.data.data[0].itemSourceId)
        testContext.put("couponUrl",map.data.data[0].couponUrl)
        testContext.put("brandId",map.data.data[0].brandId)
        testContext.put("couponShareUrl",map.data.data[0].brandId)
        testContext.put("supplierCode",map.data.data[0].supplierCode)
        testContext.put("searchId",map.data.data[0].searchId)
        return this
    }

    MiyuanRequest preInvoke(TestContext testContext){

    }

    MiyuanRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MiyuanRequest specialAssert(TestContext testContext){

    }
}
