package com.credika.biz.request.http.shop.profitSharing

import com.credika.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService

class ProfitSharingList extends ShopPost {
    {
        super.api = "profitSharing/list"
        super.params =  ["page","rows","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
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
        List dataList = testContext.getResponse().data.dataList
        for(Map map:dataList) {
            Map mysqlResult = MysqlService.profitSharing(testContext.get("shopId"),map.orderNo)
            assert mysqlResult.seller_profit_sharing_price == map.totalPrice
        }
    }
}
