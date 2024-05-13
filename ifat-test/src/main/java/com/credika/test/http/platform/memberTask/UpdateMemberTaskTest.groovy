package com.credika.test.http.platform.memberTask

import com.credika.biz.request.http.platform.memberTask.UpdateMemberTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateMemberTaskTest extends BaseTest {
    UpdateMemberTask updateMemberTask = new UpdateMemberTask()
    @Test(description = "修改会员任务" ,groups = ["prod","uat"],testName = "updateMemberTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void updateMemberTask(TestContext testContext){
        updateMemberTask.invoke(testContext).baseAssert(testContext)

    }

}
