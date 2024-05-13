package com.credika.test.http.platform.memberTask

import com.credika.biz.request.http.platform.memberTask.AddMemberTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddMemberTaskTest extends BaseTest {
    AddMemberTask addMemberTask = new AddMemberTask()
    @Test(description = "新增会员任务" ,groups = ["prod","uat"],testName = "addMemberTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void addMemberTask(TestContext testContext){
        addMemberTask.invoke(testContext).baseAssert(testContext)

    }

}
