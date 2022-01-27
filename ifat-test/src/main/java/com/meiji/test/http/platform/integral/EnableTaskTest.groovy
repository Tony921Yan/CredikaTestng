package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.EnableTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EnableTaskTest extends BaseTest {
    EnableTask enableTask = new EnableTask()
    @Test(description = "开启任务 enableTask" ,groups = ["prod","uat"],testName = "enableTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        enableTask.invoke(testContext).baseAssert(testContext)
    }
}
