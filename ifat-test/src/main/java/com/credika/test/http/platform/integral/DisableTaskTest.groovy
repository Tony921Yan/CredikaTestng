package com.credika.test.http.platform.integral
import com.credika.biz.request.http.platform.integral.DisableTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DisableTaskTest extends BaseTest {
    DisableTask disableTask = new DisableTask()
    @Test(description = "关闭任务 disableTask" ,groups = ["prod","uat"],testName = "disableTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        disableTask.invoke(testContext).baseAssert(testContext)
    }
}
