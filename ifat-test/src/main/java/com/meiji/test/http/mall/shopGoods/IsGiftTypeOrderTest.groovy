package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.IsGiftTypeOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IsGiftTypeOrderTest extends BaseTest {
    IsGiftTypeOrder isGiftTypeOrder = new IsGiftTypeOrder()
    @Test(description = "是否使用过送礼功能 isGiftTypeOrder" ,groups = ["prod","uat"],testName = "isGiftTypeOrder-c",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void isGiftTypeOrder(TestContext testContext){
        isGiftTypeOrder.invoke(testContext).baseAssert(testContext)
    }

}
