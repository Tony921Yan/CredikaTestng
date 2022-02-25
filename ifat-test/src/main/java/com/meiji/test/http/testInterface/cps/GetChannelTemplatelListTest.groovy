package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetChannelTemplatelList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelTemplatelListTest extends BaseTest {
    GetChannelTemplatelList getChannelTemplatelList = new GetChannelTemplatelList()
    @Test(description = "魔方获取生效中的专题列表 getChannelTemplatelList" ,groups = ["prod","uat"],testName = "getChannelTemplatelList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelTemplatelList(TestContext testContext){
        getChannelTemplatelList.invoke(testContext).baseAssert(testContext)
    }
}
