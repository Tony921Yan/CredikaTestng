package com.meiji.biz.request.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class Operate extends PlatformPost{
    {
        super.api = "ActiveMainManage/operate"
       super.params = ["id","status"]
    }

    Operate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Operate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    Operate afterInvoke(TestContext testContext){
        System.out.println(testContext.getRequest().id)
        testContext.put("id",testContext.getRequest().id)
    }
}
