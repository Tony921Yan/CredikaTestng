package com.meiji.test.http.platform.channel

import com.meiji.biz.request.http.platform.channel.GetChannelList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetChannelListTest extends BaseTest {
    GetChannelList getChannelList = new GetChannelList()
    @Test(description = "商品管理-频道管理 getChannelList" ,groups = ["prod","uat"],testName = "getChannelList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelList(TestContext testContext){
        getChannelList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "商品管理-频道管理-精确搜索 getChannelList" ,groups = ["prod","uat"],testName = "getChannelList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelList1(TestContext testContext){
        getChannelList.invoke(testContext).baseAssert(testContext)
    }
}
