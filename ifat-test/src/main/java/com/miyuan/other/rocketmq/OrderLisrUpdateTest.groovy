package com.miyuan.other.rocketmq


import com.miyuan.api.RocketMqAPI
import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import org.testng.annotations.Test

class OrderLisrUpdateTest extends BaseTest{

    @Test(description = "发送订单列表更新消息" ,groups = ["prod","uat"],testName = "common",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchSuccess(TestContext testContext){



            long userId = 22038344

            RocketMqAPI.send("user-com-item-update-topic",userId)


    }

}
