package com.meiji.test.http.mall.coupon

import com.meiji.biz.request.http.mall.coupon.SearchGoodsByCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchGoodsByCouponTest extends BaseTest {
    SearchGoodsByCoupon searchGoodsByCoupon = new SearchGoodsByCoupon()

    @Test(description = "查询券适用的商品-综合 searchGoodsByCoupon", groups = ["prod", "uat"], testName = "searchGoodsByCoupon",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void searchGoodsByCoupon(TestContext testContext) {
        searchGoodsByCoupon.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询券适用的商品-新品 searchGoodsByCoupon", groups = ["prod", "uat"], testName = "searchGoodsByCoupon1",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void searchGoodsByCoupon1(TestContext testContext) {
        searchGoodsByCoupon.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询券适用的商品-销量 searchGoodsByCoupon", groups = ["prod", "uat"], testName = "searchGoodsByCoupon2",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void searchGoodsByCoupon2(TestContext testContext) {
        searchGoodsByCoupon.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询券适用的商品-价格 searchGoodsByCoupon", groups = ["prod", "uat"], testName = "searchGoodsByCoupon3",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void searchGoodsByCoupon3(TestContext testContext) {
        searchGoodsByCoupon.invoke(testContext).baseAssert(testContext)
    }

}