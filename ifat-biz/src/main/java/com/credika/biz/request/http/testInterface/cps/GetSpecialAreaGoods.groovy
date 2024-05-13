package com.credika.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

import java.util.stream.Collectors

class GetSpecialAreaGoods extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getSpecialAreaGoods"
        super.params =  ["categoryType","cpsCategoryId","page","rows","priceSort","publishTimeSort","salesSort"]
    }

    GetSpecialAreaGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSpecialAreaGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSpecialAreaGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    static List getCpsSkuIds(TestContext testContext){
        List<Map> cpsGoodDataList = testContext.getResponse().get("data")
        List<Map> skuIds =cpsGoodDataList.stream().map { x -> return x."skuId" }.collect(Collectors.toList())
        return skuIds
    }

}
