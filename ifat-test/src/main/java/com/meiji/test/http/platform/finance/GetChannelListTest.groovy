package com.meiji.test.http.platform.finance

import com.meiji.biz.request.http.platform.finance.GetChannelList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelListTest extends BaseTest {//请求参数为空
    GetChannelList getChannelList = new GetChannelList()
    @Test(description = "渠道费用 getChannelList" ,groups = ["prod","uat"],testName = "getChannelList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelList(TestContext testContext){
        getChannelList.invoke(testContext).baseAssert(testContext)
    }
}
