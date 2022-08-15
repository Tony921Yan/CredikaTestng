package com.meiji.test.http.platform.integral
import com.meiji.biz.request.http.platform.integral.AddTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddTaskTest extends BaseTest {
    AddTask addTask = new AddTask()
    @Test(description = "任务创建-浏览晒单 addTask" ,groups = ["prod","uat"],testName = "addTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        addTask.invoke(testContext).baseAssert(testContext)
    }

//    AddTask addTask1 = new AddTask()
    @Test(description = "任务创建-签到礼包 addTask1" ,groups = ["prod","uat"],testName = "addTask1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addTask1(TestContext testContext){
        addTask.invoke(testContext).baseAssert(testContext)
    }

}
