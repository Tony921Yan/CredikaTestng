package com.meiji.biz.request.http.shop.shopinfo

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopById extends ShopPost {
    {
        super.api = "/shop/findShopById"
        super.params =  [ "id"]
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
        Map mysqlResult = MysqlService.findShopById(testContext.get("id")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.id == apiResult.id
        assert mysqlResult.dealer_id == apiResult.dealerId
        assert mysqlResult.shop_type == apiResult.shopType
        assert mysqlResult.shop_code == apiResult.shopCode
        assert mysqlResult.shop_name == apiResult.shopName
        assert mysqlResult.shop_icon == apiResult.shopIcon
        assert mysqlResult.brief == apiResult.brief
        assert mysqlResult.qr_code == apiResult.qrCode
        assert mysqlResult.module_template_id == apiResult.moduleTemplateId
        assert mysqlResult.auth_state == apiResult.authState
    }
}
