package com.meiji.test.http.mall.coupon
import com.meiji.biz.request.http.mall.coupon.GetMaxDiscount
import com.meiji.biz.request.http.mall.coupon.IsShowGetCoupon
import com.meiji.biz.request.http.mall.coupon.ReceiveCoupon
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ReceiveCouponTest extends BaseTest {
    ReceiveCoupon receiveCoupon = new ReceiveCoupon()
    IsShowGetCoupon isShowGetCoupon = new IsShowGetCoupon()
    Random random = new Random()
    @Test(description = "商详/送礼专区页面--领券 receiveCoupon" ,groups = ["prod","uat"],testName = "receiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void receiveCoupon(TestContext testContext){
        testContext.put("defaultSkuId", MysqlService.isShowGetCoupon(testContext.get("spuId")))
        testContext.put("source", random.nextInt(1)+1)
        isShowGetCoupon.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        receiveCoupon.invoke(testContext).baseAssert(testContext)
    }


}