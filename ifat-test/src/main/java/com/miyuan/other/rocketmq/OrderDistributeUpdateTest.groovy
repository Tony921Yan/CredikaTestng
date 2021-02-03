package com.miyuan.other.rocketmq


import com.miyuan.api.RocketMqAPI
import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.util.DateUtil
import com.miyuan.util.JsonUtil
import com.miyuan.util.ResourceUtil
import org.testng.annotations.Test

class OrderDistributeUpdateTest extends BaseTest{

    @Test(description = "发送订单消息" ,groups = ["prod","uat"],testName = "common",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerUpdateSuccess(TestContext testContext){
        //批量循环增加
        for (Integer i=1; i<=10 ;i++)
        {
            String version =i+1
            String sourceStatus =i
            String date = DateUtil.dateToStr(new Date())
            String comSource = ResourceUtil.getFile("test.txt")
            String cc = comSource.replace("#version#",version).replace("#date#",date).replace("#sourceStatus#",sourceStatus)
            RocketMqAPI.send("miyuan-order-commission-result-topic",JsonUtil.toJsonString(JsonUtil.strToJson(cc)))
        }

    }

}
