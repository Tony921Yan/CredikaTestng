package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetChannelConfig
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelConfigTest extends BaseTest {//若优惠券活动结束了，就不会返回"topicDetailActiveImage"，"topicExpiryStart"，"topicExpiryEnd"
    GetChannelConfig getChannelConfig = new GetChannelConfig()
    @Test(description = "获取专题配置信息 getChannelConfig" ,groups = ["prod","uat"],testName = "getChannelConfig",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelConfig(TestContext testContext){
//        testContext.put("templateId",1481173899411519)
        testContext.put("templateId",1481310994432063)
        getChannelConfig.invoke(testContext).baseAssert(testContext)
    }
}
