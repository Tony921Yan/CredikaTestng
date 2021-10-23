package com.meiji.test.http.platform.finance

import com.meiji.biz.request.http.platform.finance.GetChannelCostList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetChannelCostListTest extends BaseTest {
    GetChannelCostList getChannelCostList = new GetChannelCostList()
    @Test(description = "财务管理-付款明细 getChannelCostList" ,groups = ["prod","uat"],testName = "getChannelCostList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelCostList(TestContext testContext){
        getChannelCostList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "财务管理-付款明细-搜索成功状态 getChannelCostList" ,groups = ["prod","uat"],testName = "getChannelCostList-success",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelCostList1(TestContext testContext){
        getChannelCostList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "财务管理-付款明细-搜索冲正状态 getChannelCostList" ,groups = ["prod","uat"],testName = "getChannelCostList-update",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelCostList2(TestContext testContext){
        getChannelCostList.invoke(testContext).baseAssert(testContext)
    }
}
