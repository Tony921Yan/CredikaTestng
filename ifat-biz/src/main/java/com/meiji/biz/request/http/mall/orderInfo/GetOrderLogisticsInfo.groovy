package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallGet
import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class GetOrderLogisticsInfo extends MallGet {
    {
        super.api = "/orderInfo/getOrderLogisticsInfo"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallGet specialAssert(TestContext testContext){
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
