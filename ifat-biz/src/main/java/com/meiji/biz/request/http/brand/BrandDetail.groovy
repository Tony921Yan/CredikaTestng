package com.meiji.biz.request.http.brand

import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class BrandDetail extends MeijiRequest {
    {
        super.api = "/platform/brandMgr/brandDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MeijiRequest specialAssert(TestContext testContext){
        Map mysqlResult = com.meiji.biz.service.MysqlService.getBrand(testContext.get("id"))
        println("MySQL打印：" + mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
    }
}
