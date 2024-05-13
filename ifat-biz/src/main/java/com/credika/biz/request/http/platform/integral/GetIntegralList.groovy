package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class GetIntegralList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/IntegralList/getIntegralList"
        super.params = ["condition","page","rows"]
    }

    GetIntegralList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetIntegralList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetIntegralList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetIntegralList specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.dataList.getAt(0))
        System.out.println("apiResult"+apiResult.dataList.getAt(0).getAt("changeIntegral"))
        Map mysqlResult = com.credika.biz.service.MysqlService.getIntegralList()
        System.out.print("mysqlResult"+mysqlResult)
        assert apiResult.total > 10
        assert mysqlResult.change_integral == apiResult.dataList.getAt(0).getAt("changeIntegral")
        assert mysqlResult.pre_update_integral == apiResult.dataList.getAt(0).getAt("preUpdateIntegral")
        assert mysqlResult.after_update_integral == apiResult.dataList.getAt(0).getAt("afterUpdateIntegral")
        assert com.credika.biz.util.DateUtil.strToDate(mysqlResult.do_task_time as String) == com.credika.biz.util.DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("doTaskTime"))
        return this
    }

}