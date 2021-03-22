package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindShopGoodsDetail
import org.testng.annotations.Test

class FindShopGoodsDetailTest extends BaseTest {
    FindShopGoodsDetail findShopGoodsDetail = new FindShopGoodsDetail()
    @Test(description = "查询店铺商品详情 findShopGoodsDetail" ,groups = ["prod","uat"],testName = "findShopGoodsDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsDetail(TestContext testContext){
        findShopGoodsDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
