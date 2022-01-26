package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.AddTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddTaskTest extends BaseTest {
    AddTask addTask = new AddTask()
    @Test(description = "任务创建 addTask" ,groups = ["prod","uat"],testName = "addTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        addTask.invoke(testContext).baseAssert(testContext)
    }
}
