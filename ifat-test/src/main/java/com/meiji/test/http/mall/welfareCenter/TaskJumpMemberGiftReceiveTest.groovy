package com.meiji.test.http.mall.welfareCenter
import com.meiji.biz.request.http.mall.welfareCenter.TaskJumpMemberGiftReceive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class TaskJumpMemberGiftReceiveTest extends BaseTest {
    TaskJumpMemberGiftReceive taskJumpMemberGiftReceive = new TaskJumpMemberGiftReceive()
    @Test(description = "页面跳转任务-领取礼包" ,groups = ["prod","uat"],testName = "taskJumpMemberGiftReceive",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void memberTaskQuery(TestContext testContext){
        taskJumpMemberGiftReceive.invoke(testContext).baseAssert(testContext)
    }
}
