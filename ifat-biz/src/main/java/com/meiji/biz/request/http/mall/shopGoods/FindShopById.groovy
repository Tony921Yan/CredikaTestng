package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopById extends MallPost {
    {
        super.api = "/shopGoods/findShopById"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallPost specialAssert(TestContext testContext){
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
    }
}
