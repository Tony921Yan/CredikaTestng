package com.meiji.biz.request.http.mall


import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class GetOrderLogisticsInfo extends com.meiji.biz.request.http.MeijiGet {
    {
        super.api = "/mall/order/getOrderLogisticsInfo?orderCode=1234"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    com.meiji.biz.request.http.MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    com.meiji.biz.request.http.MeijiGet specialAssert(TestContext testContext){
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
