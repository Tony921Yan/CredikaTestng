package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FindShopByUserId extends MallPost {
    {
        super.api = "shopGoods/findShopByUserId"
        super.params =  []
    }

    FindShopByUserId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopByUserId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopByUserId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopByUserId specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.findShopByUserId()
        assert apiResult.brief == mysqlResult.brief
        assert apiResult.id == mysqlResult.id
        assert apiResult.dealerId == mysqlResult.dealer_id
        assert apiResult.shopName == mysqlResult.shop_name
        assert apiResult.shopIcon == mysqlResult.shop_icon
        assert apiResult.qrCode == mysqlResult.qr_code
        assert apiResult.moduleTemplateId == mysqlResult.module_template_id
        assert apiResult.authState == mysqlResult.auth_state
        assert apiResult.state == mysqlResult.state
        assert apiResult.shopType == mysqlResult.shop_type
        assert apiResult.settlementAuthStatus == mysqlResult.settlement_auth_status
        return this
    }

}
