package com.meiji.test.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.goodsOriginManage.CommitTrace
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CommitTraceTest extends BaseTest {
    CommitTrace commitTrace = new CommitTrace()
    @Test(description = "提交溯源 commitTrace" ,groups = ["prod","uat"],testName = "commitTrace",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void commitTrace(TestContext testContext){
        testContext.put("id", MysqlService.commitTrace().get(0))
        commitTrace.invoke(testContext).baseAssert(testContext)
    }
}

