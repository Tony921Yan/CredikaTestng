package com.meiji.biz.request.http.shop.shopauth
import com.meiji.biz.request.http.shop.ShopPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FindShopBusinessInfo extends ShopPost {
    {
        super.api = "/shop/findShopBusinessInfo"
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
//        Map mysqlResult = MysqlService.findShopBusinessInfo(testContext.get("shop_id")).get(0)
//        List apiResult = testContext.getResponse().data
//        assert apiResult.shopId == mysqlResult.shop_id
//        assert apiResult.organizationType == mysqlResult.organization_type
//        assert apiResult.businessTimeType == mysqlResult.business_time_type
//        assert apiResult.idCardName == mysqlResult.id_card_name
//        assert apiResult.idCardNumber == mysqlResult.id_card_number
//        assert apiResult.idCardCopyUrl == mysqlResult.id_card_copy_url
//        assert apiResult.idCardCopy == mysqlResult.id_card_copy
//        assert apiResult.idCardNationalUrl == mysqlResult.id_card_national_url
//        assert apiResult.idCardNational == mysqlResult.id_card_national
//        assert apiResult.idCardValidTimeType == mysqlResult.id_card_valid_time_type
//        assert apiResult.contactName == mysqlResult.contact_name
//        assert apiResult.mobilePhone == mysqlResult.mobile_phone
//        assert apiResult.contactEmail == mysqlResult.contact_email
//        assert apiResult.merchantShortname == mysqlResult.merchant_shortname
//        assert apiResult.state == mysqlResult.state

    }
}
