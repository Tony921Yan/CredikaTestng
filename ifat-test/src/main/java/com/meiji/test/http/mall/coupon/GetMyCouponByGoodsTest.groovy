package com.meiji.test.http.mall.coupon

import com.meiji.biz.request.http.mall.coupon.GetMyCouponByGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMyCouponByGoodsTest extends BaseTest {
    GetMyCouponByGoods getMyCouponByGoods = new GetMyCouponByGoods()
    @Test(description = "查询当前商品当前用户可以用的券-商品详情使用 getMyCouponByGoods" ,groups = ["prod","uat"],testName = "getMyCouponByGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMyCouponByGoods(TestContext testContext){
        getMyCouponByGoods.invoke(testContext).baseAssert(testContext)
    }


}