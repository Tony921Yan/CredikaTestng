package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class BatchUpdateConfig extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "SystemConfigMgr/batchUpdateConfig"
        super.params =  ["configs"]
    }

    BatchUpdateConfig invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    BatchUpdateConfig preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    BatchUpdateConfig baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    BatchUpdateConfig specialAssert(TestContext testContext){
        List apiResult = testContext.get("configs") //通过platformPost: testContext.setRequest(req)设置
        Map mysqlResult = com.credika.biz.service.MysqlService.batchUpdateConfig()
        for (Map map:apiResult){if(map.get("key")=="lockingPeriod") {assert map.get("value")== mysqlResult.get("new_value")}}
        return this
    }
}
