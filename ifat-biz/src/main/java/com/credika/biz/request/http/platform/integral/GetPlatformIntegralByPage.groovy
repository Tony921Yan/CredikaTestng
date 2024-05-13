package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class GetPlatformIntegralByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="IntegralList/getPlatformIntegralByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    GetPlatformIntegralByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetPlatformIntegralByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetPlatformIntegralByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetPlatformIntegralByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = com.credika.biz.service.MysqlService.GetPlatformIntegralByPage().get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total>0
        assert mysqlResult.change_type ==apiResult.dataList.getAt(0).getAt("changeType")
        assert mysqlResult.change_type ==apiResult.dataList.getAt(0).getAt("changeType")
        assert mysqlResult.change_integral ==apiResult.dataList.getAt(0).getAt("changeIntegral")
        assert mysqlResult.pre_update_integral ==apiResult.dataList.getAt(0).getAt("preUpdateIntegral")
        assert mysqlResult.after_update_integral ==apiResult.dataList.getAt(0).getAt("afterUpdateIntegral")
        return this
    }

}