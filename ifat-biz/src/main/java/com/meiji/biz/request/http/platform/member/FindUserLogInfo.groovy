package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FindUserLogInfo extends PlatformPost{
    {
        super.api="/Memeber/findUserLogInfo"
        super.params = ["condition","id","page","rows"]
    }

    FindUserLogInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserLogInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserLogInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
   FindUserLogInfo specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total > 10
   }

}
