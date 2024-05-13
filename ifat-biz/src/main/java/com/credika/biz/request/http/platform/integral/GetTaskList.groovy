package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class GetTaskList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/TaskManage/getTaskList"
        super.params = ["condition","page","rows"]
    }

    GetTaskList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTaskList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTaskList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetTaskList specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total > 5
        return this
    }

}