package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class StockManger extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/stock/stockManger"
        super.params =  [ "goodsName","skuCode","skuId","spuCode","spuId","stockNum","suppierGoodsCode","suppierName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    StockManger invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    StockManger preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    StockManger baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    StockManger specialAssert(TestContext testContext){
        Map mysqlResult = com.credika.biz.service.MysqlService.getBrand(testContext.get("id"))
        println("MySQL打印：" + mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert com.credika.biz.util.DateUtil.strToDate(mysqlResult.gmt_create as String) == com.credika.biz.util.DateUtil.strToDate(apiResult.gmtCreate)
        assert  com.credika.biz.util.DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  com.credika.biz.util.DateUtil.strToDate(apiResult.gmtModified)
        return this
    }
}
