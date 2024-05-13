package com.credika.test.http.mall.newVip



import com.credika.biz.request.http.mall.newVip.GetGoodsInCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsInCouponTest extends BaseTest {
    GetGoodsInCoupon getGoodsInCoupon = new GetGoodsInCoupon()
    @Test(description = "查询粉丝券活动商品 getGoodsInCoupon" ,groups = ["prod","uat"],testName = "getGoodsInCoupon-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsInCoupon(TestContext testContext){
        getGoodsInCoupon.invoke(testContext).baseAssert(testContext)
    }
}