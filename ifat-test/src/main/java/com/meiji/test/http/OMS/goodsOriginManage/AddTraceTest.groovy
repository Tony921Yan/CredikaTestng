package com.meiji.test.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.goodsOriginManage.AddTrace
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddTraceTest extends BaseTest {
    AddTrace addTrace = new AddTrace()
    @Test(description = "添加溯源 addTrace" ,groups = ["prod","uat"],testName = "addTrace",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void addTrace(TestContext testContext){
        addTrace.invoke(testContext).baseAssert(testContext)
    }
}

