package com.miyuan.other.rocketmq

import com.miyuan.api.RocketMqAPI
import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.util.DateUtil
import com.miyuan.util.JsonUtil
import com.miyuan.util.ResourceUtil
import org.testng.annotations.Test

class OrderDistributeTest  extends BaseTest{

    @Test(description = "发送订单消息" ,groups = ["prod","uat"],testName = "common",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerSearchSuccess(TestContext testContext){
        //批量循环增加
        for (Integer i=1; i<=1 ;i++)
        {
            //String uuid = System.currentTimeMillis()+ RandomUtil.getRandomInt(5)
            String uuid = i.toString()

            String date = DateUtil.dateToStr(new Date())
            String comSource = ResourceUtil.getFile("test.txt")
            String cc = comSource.replace("#uuid#",uuid).replace("#date#",date)
            RocketMqAPI.send("miyuan-order-commission-result-topic",JsonUtil.toJsonString(JsonUtil.strToJson(cc)))
        }

    }

}
