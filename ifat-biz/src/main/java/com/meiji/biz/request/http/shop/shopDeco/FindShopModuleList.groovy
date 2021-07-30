package com.meiji.biz.request.http.shop.shopDeco

import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopModuleList extends ShopPost {
    {
        super.api = "shopDeco/findShopModuleList"
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
        Map mysqlResult = MysqlService.getBrand(testContext.get("id"))
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert  DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
    }
}
