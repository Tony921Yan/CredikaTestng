package com.meiji.biz.request.http.mall


import com.miyuan.ifat.support.test.TestContext

class FindShopGoodsList extends com.meiji.biz.request.http.MeijiRequest {
    {
        super.api = "/mall/shop/goods/findShopGoodsList"
        super.params =  ["page","rows","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    com.meiji.biz.request.http.MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    com.meiji.biz.request.http.MeijiRequest specialAssert(TestContext testContext){
        Map mysqlResult = com.meiji.biz.service.MysqlService.getBrand(testContext.get("id"))
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert com.meiji.biz.util.DateUtil.strToDate(mysqlResult.gmt_create as String) == com.meiji.biz.util.DateUtil.strToDate(apiResult.gmtCreate)
        assert  com.meiji.biz.util.DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  com.meiji.biz.util.DateUtil.strToDate(apiResult.gmtModified)
    }
}
