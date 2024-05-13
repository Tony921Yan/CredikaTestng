package com.credika.biz.request.http.shop.profitSharing

import com.credika.biz.request.http.shop.ShopPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class Asset extends ShopPost {
    {
        super.api = "profitSharing/asset"
        super.params =  ["shopId"]
    }

    ShopPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    ShopPost specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.asset(testContext.get("shopId")).get(0)
        Map apiResult = testContext.getResponse().data
        if (mysqlResult.TotalPrice == null){
            mysqlResult.TotalPrice =0;
            assert apiResult.totalPrice == mysqlResult.TotalPrice;
        }else
            assert String.valueOf(apiResult.totalPrice) == String.valueOf(mysqlResult.TotalPrice)
    }
//
//    MeijiGet dateAssert(TestContext testContext){
//        List mysqlData = MysqlService.get
//    }
}
