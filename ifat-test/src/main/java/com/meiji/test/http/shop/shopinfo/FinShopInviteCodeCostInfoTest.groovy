package com.meiji.test.http.shop.shopinfo

import com.meiji.biz.request.http.shop.shopinfo.FinShopInviteCodeCostInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FinShopInviteCodeCostInfoTest extends BaseTest {
    FinShopInviteCodeCostInfo finShopInviteCodeCostInfo = new FinShopInviteCodeCostInfo()
    @Test(description = "查询兑换邀请码花费信息 finShopInviteCodeCostInfo" ,groups = ["prod","uat"],testName = "finShopInviteCodeCostInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void finShopInviteCodeCostInfo(TestContext testContext){
        testContext.put("id",1405981112139808)
        finShopInviteCodeCostInfo.invoke(testContext).baseAssert(testContext)
    }
}
