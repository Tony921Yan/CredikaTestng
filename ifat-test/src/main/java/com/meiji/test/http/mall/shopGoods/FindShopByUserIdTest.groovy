package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindShopByUserId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopByUserIdTest extends BaseTest {
    FindShopByUserId findShopByUserId = new FindShopByUserId()
    @Test(description = "店铺介绍 findShopByUserId" ,groups = ["prod","uat"],testName = "findShopByUserId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopByUserId(TestContext testContext){
        findShopByUserId.invoke(testContext).baseAssert(testContext)
    }
}
