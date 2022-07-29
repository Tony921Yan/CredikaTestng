package com.meiji.test.http.mall.myMessage

import com.meiji.biz.request.http.mall.myMessage.UpdateMessageStatus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateMessageStatusTest extends BaseTest{
    UpdateMessageStatus updateMessageStatus = new UpdateMessageStatus()
    @Test(description = "更新消息为已读" ,groups = ["prod","uat"],testName = "updateMessageStatus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void updateMessageStatus(TestContext testContext){
        updateMessageStatus.invoke(testContext).baseAssert(testContext)
//        updateMessageStatus.specialAssert(testContext)
    }
}
