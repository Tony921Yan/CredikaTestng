package com.meiji.test.http.mall.coupon
import com.meiji.biz.request.http.mall.coupon.IsShowGetCoupon
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IsShowGetCouponTest extends BaseTest {
    IsShowGetCoupon isShowGetCoupon = new IsShowGetCoupon()
    Random rand = new Random()
    @Test(description = "是否展示领券活动 isShowGetCoupon" ,groups = ["prod","uat"],testName = "isShowGetCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void isShowGetCoupon(TestContext testContext){
        testContext.put("defaultSkuId", MysqlService.isShowGetCoupon(testContext.get("spuId")))
        testContext.put("source", rand.nextInt(1)+1)    //1 商详 2 确认订单页/支付成功页/订单详情页
        isShowGetCoupon.invoke(testContext).baseAssert(testContext)
    }


}