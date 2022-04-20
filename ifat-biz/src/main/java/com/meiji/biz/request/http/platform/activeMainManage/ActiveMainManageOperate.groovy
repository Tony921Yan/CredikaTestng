package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageOperate extends PlatformPost{
    {
        super.api = "ActiveMainManage/operate"
       super.params = ["id","status"]
    }

    ActiveMainManageOperate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManageOperate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    ActiveMainManageOperate afterInvoke(TestContext testContext){
        System.out.println(testContext.getRequest().id)
        testContext.put("id",testContext.getRequest().id)
    }
}
