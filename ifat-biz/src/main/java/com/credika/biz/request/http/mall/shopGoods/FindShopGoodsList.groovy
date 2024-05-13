package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import java.util.stream.Collectors

class FindShopGoodsList extends MallPost {
    {
        super.api = "/shopGoods/searchGoodsList"
        super.params =  ["page","rows","shopId","categoryIdList","keyword","state"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindShopGoodsList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopGoodsList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopGoodsList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopGoodsList specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this

    }
    static List getSkuIds(TestContext testContext){
        List<Map> goodDataList = testContext.getResponse().get("data")
        List<Map> skuIds =goodDataList.stream().map { x -> return x."skuId" }.collect(Collectors.toList())
        return skuIds
    }
}
