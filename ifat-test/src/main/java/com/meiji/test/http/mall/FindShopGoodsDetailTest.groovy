package com.meiji.test.http.mall

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.mall.FindShopGoodsDetail
import org.testng.annotations.Test

class FindShopGoodsDetailTest extends BaseTest {
    FindShopGoodsDetail findShopGoodsDetail = new FindShopGoodsDetail()
    @Test(description = "查询店铺商品详情 findShopGoodsDetail" ,groups = ["prod","uat"],testName = "findShopGoodsDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsDetail(TestContext testContext){
        findShopGoodsDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
