package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageOperate extends com.credika.biz.request.http.platform.PlatformPost{
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
