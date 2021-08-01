package com.meiji.test.http.shop.dealer

import com.meiji.biz.request.http.shop.dealer.MsgTemplate
import com.meiji.biz.request.http.shop.dealer.ReadAck
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ReadAckTest extends BaseTest {
    ReadAck readAck = new ReadAck()
    @Test(description = "消息已读回执 readAck" ,groups = ["prod","uat"],testName = "readAck",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void readAck(TestContext testContext){
        readAck.invoke(testContext).baseAssert(testContext)
    }
}
