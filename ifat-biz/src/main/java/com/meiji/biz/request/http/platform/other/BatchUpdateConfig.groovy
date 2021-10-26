package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class BatchUpdateConfig extends PlatformPost {
    {
        super.api = "SystemConfigMgr/batchUpdateConfig"
        super.params =  ["configs"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost specialAssert(TestContext testContext){
        List apiResult = testContext.get("configs") //通过platformPost: testContext.setRequest(req)设置
        Map mysqlResult = MysqlService.batchUpdateConfig()
        assert apiResult.get(5).getAt("value") == mysqlResult.get("new_value")
        System.out.println(apiResult.get(5).getAt("value"))
        System.out.println(mysqlResult.get("new_value"))
    }
}
