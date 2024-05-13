package com.credika.biz.request.http.mall.orderInfo


import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetOrderLogisticsInfo extends MallPost {
    {
        super.api = "orderInfo/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderLogisticsInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderLogisticsInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderLogisticsInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetOrderLogisticsInfo specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getOrderLogisticsInfo(testContext.get("orderCode")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data[0]
        assert mysqlResult.logistics_code == apiResult.logisticsCode
        assert mysqlResult.logistics_company_code == apiResult.logisticsCompanyCode
        return this
    }
}
