package com.credika.biz.request.http.shop.shopauth

import com.credika.biz.request.http.shop.ShopGet
import com.miyuan.ifat.support.test.TestContext

class DeleteAfterOrder extends ShopGet {
    {
        super.api = "/shop/order/deleteAfterOrder?afterCode=R2021040211380581695" //after_status为7才允许删除，delete_flag 由0变1
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ShopGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShopGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShopGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
