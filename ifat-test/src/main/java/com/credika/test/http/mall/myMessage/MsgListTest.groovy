package com.credika.test.http.mall.myMessage

import com.credika.biz.request.http.mall.myMessage.MsgList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MsgListTest extends BaseTest{
    MsgList msgList = new MsgList()
    @Test(description = "消息列表" ,groups = ["prod","uat"],testName = "msgList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void list(TestContext testContext){
        msgList.invoke(testContext).baseAssert(testContext)
//        msgList.specialAssert(testContext)
    }
}
