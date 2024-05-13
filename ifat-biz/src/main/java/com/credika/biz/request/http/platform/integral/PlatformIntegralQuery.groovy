package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class PlatformIntegralQuery extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="IntegralList/platformIntegralQuery"
        super.params = []
    }

    PlatformIntegralQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformIntegralQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformIntegralQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PlatformIntegralQuery specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = com.credika.biz.service.MysqlService.PlatformIntegralQuery().get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.integral == apiResult.integral
        return this
    }

}