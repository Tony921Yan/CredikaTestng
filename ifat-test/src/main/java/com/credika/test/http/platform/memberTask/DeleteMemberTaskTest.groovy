package com.credika.test.http.platform.memberTask

import com.credika.biz.request.http.platform.memberTask.DeleteMemberTask
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteMemberTaskTest extends BaseTest {
    DeleteMemberTask deleteMemberTask = new DeleteMemberTask()
    @Test(description = "删除会员任务" ,groups = ["prod","uat"],testName = "deleteMemberTask",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void deleteMemberTask(TestContext testContext){
        deleteMemberTask.invoke(testContext).baseAssert(testContext)

    }

}
