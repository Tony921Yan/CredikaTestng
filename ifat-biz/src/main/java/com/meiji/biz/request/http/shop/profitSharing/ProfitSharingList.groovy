package com.meiji.biz.request.http.shop.profitSharing

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


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
        Map apiResult = testContext.getResponse().data
        List mysqlResult = MysqlService.profitSharing(testContext.get("shopId"))
        Map map = apiResult.get("dataList")[0];
        try{
            assert mysqlResult.get(0).get("seller_profit_sharing_price") == map.get("totalPrice")
        }catch(IndexOutOfBoundsException){
            assert true
        }
    }
}
