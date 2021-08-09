package com.meiji.test.http.shop.shopinfo

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.shopinfo.FindShopById
import org.testng.annotations.Test

class FindShopByIdTest extends BaseTest {
    FindShopById findShopById = new FindShopById()
    @Test(description = "根据id查询店铺信息 findShopById" ,groups = ["prod","uat"],testName = "findShopById1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopById(TestContext testContext){
        findShopById.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
