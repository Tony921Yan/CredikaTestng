package com.meiji.biz.request.http.mall.integral
import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class SendIntegral extends MallPost {
    {
        super.api = "integral/sendIntegral"
        super.params = ["userId", "taskType", "taskId"]
    }

    SendIntegral invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SendIntegral baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }
}