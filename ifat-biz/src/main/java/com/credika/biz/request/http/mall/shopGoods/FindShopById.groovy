package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService

class FindShopById extends MallPost {
    {
        super.api = "/shopGoods/findShopById"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindShopById invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopById preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopById baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopById specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.findShopById(testContext.get("id")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.id == apiResult.id
        assert mysqlResult.dealer_id == apiResult.dealerId
        assert mysqlResult.shop_name == apiResult.shopName
        assert mysqlResult.shop_icon == apiResult.shopIcon
        assert mysqlResult.brief == apiResult.brief
        assert mysqlResult.qr_code == apiResult.qrCode
        assert mysqlResult.module_template_id == apiResult.moduleTemplateId
        assert mysqlResult.auth_state == apiResult.authState
        assert mysqlResult.state == apiResult.state
        return this
    }
}
