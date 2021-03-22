package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindShopById
import org.testng.annotations.Test

class FindShopByIdTest extends BaseTest {
    FindShopById findShopById = new FindShopById()
    @Test(description = "根据id查询店铺信息 findShopById" ,groups = ["prod","uat"],testName = "findShopById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopById(TestContext testContext){
        findShopById.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
