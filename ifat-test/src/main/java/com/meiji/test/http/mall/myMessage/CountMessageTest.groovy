package com.meiji.test.http.mall.myMessage

import com.meiji.biz.request.http.mall.myMessage.CountMessage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CountMessageTest extends BaseTest{
    CountMessage countMessage = new CountMessage()
    @Test(description = "查询未读消息总数" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void countMessage(TestContext testContext){
        countMessage.invoke(testContext).baseAssert(testContext)
        countMessage.specialAssert(testContext)
    }
}
