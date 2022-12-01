package com.meiji.test.http.mall.coupon
import com.meiji.biz.request.http.mall.coupon.GetMaxDiscount
import com.meiji.biz.request.http.mall.coupon.IsShowGetCoupon
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMaxDiscountTest extends BaseTest {
    GetMaxDiscount getMaxDiscount =new GetMaxDiscount()
    IsShowGetCoupon isShowGetCoupon = new IsShowGetCoupon()
    Random random = new Random()
    @Test(description = "获取商品最大优惠券 getMaxDiscount" ,groups = ["prod","uat"],testName = "getMaxDiscount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMaxDiscount(TestContext testContext){
        testContext.put("defaultSkuId", MysqlService.isShowGetCoupon(testContext.get("spuId")))
        testContext.put("source", random.nextInt(1)+1)
        isShowGetCoupon.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        getMaxDiscount.invoke(testContext).baseAssert(testContext)
    }


}