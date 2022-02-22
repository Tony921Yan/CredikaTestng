package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import java.util.stream.Collectors

class GetColumnGoods extends MallPost {
    {
        super.api = "/home/getColumnGoods"
        super.params =  ["page","rows","shopId","columnId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetColumnGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetColumnGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetColumnGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetColumnGoods specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this

    }
    static List getSkuIds(TestContext testContext){
        List<Map> goodDataList = testContext.getResponse().get("data")
        List<Map> skuIds =goodDataList.stream().map { x -> return x."skuId" }.collect(Collectors.toList())
        return skuIds
    }
}
