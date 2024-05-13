package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext
class UserIntegralByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="IntegralList/userIntegralByPage"
        super.params = ["condition","order","page","rows","sort"]
    }

    UserIntegralByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UserIntegralByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UserIntegralByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    UserIntegralByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = com.credika.biz.service.MysqlService.UserIntegralByPage().get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total > 20
//        assert  mysqlResult.integral == apiResult.dataList.getAt(0).getAt("integral")
//        assert  mysqlResult.user_id == apiResult.dataList.getAt(0).getAt("userId")
        return this
    }

}