package com.credika.test.http.platform.memberTask

import com.credika.biz.request.http.platform.memberTask.UpdateMemberTaskStatus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateMemberTaskStatusTest extends BaseTest {
    UpdateMemberTaskStatus updateMemberTaskStatus = new UpdateMemberTaskStatus()
    @Test(description = "修改会员任务状态" ,groups = ["prod","uat"],testName = "updateMemberTaskStatus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void updateMemberTaskStatus(TestContext testContext){
        updateMemberTaskStatus.invoke(testContext).baseAssert(testContext)

    }

}
