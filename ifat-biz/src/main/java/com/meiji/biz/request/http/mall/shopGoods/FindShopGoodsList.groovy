package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindShopGoodsList extends MallPost {
    {
        super.api = "/shopGoods/searchGoodsList"
        super.params =  ["page","rows","shopId","categoryIdList","keyword","state"]
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
//        Map mysqlResult = com.meiji.biz.service.MysqlService.getBrand(testContext.get("id"))
//        println(mysqlResult)
//        Map apiResult = testContext.getResponse().data
//        assert mysqlResult.name == apiResult.name
//        assert mysqlResult.icon == apiResult.icon
//        assert mysqlResult.remark == apiResult.remark
//        assert mysqlResult.create_by == apiResult.createBy
//        assert com.meiji.biz.util.DateUtil.strToDate(mysqlResult.gmt_create as String) == com.meiji.biz.util.DateUtil.strToDate(apiResult.gmtCreate)
//        assert  com.meiji.biz.util.DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  com.meiji.biz.util.DateUtil.strToDate(apiResult.gmtModified)
    }
}
