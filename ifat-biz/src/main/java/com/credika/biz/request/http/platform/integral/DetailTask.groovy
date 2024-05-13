package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class DetailTask extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/TaskManage/detailTask"
        super.params = ["id"]
    }

    DetailTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DetailTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DetailTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    DetailTask specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = com.credika.biz.service.MysqlService.detailTask(testContext.get("id"))
        System.out.print("mysqlResult"+mysqlResult)
        assert mysqlResult.task_type == apiResult.taskType
        assert mysqlResult.task_logo == apiResult.taskLogo
        return this
    }

}