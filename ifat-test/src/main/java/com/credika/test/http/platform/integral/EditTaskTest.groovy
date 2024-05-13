package com.credika.test.http.platform.integral

import com.credika.biz.request.http.platform.integral.EditTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EditTaskTest extends BaseTest {
    EditTask editTask = new EditTask()
    @Test(description = "任务编辑 editTask" ,groups = ["prod","uat"],testName = "editTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addGoods(TestContext testContext){
        editTask.invoke(testContext).baseAssert(testContext)
    }
}
