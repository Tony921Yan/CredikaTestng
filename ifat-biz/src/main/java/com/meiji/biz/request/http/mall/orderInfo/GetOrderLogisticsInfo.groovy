package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallGet
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class GetOrderLogisticsInfo extends MallPost {
    {
        super.api = "orderInfo/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
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
        Map mysqlResult = MysqlService.getOrderLogisticsInfo(testContext.get("orderCode")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data[0]
        assert mysqlResult.logistics_code == apiResult.logisticsCode
        assert mysqlResult.logistics_company_code == apiResult.logisticsCompanyCode
    }
}
