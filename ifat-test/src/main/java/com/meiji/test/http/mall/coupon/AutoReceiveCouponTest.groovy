package com.meiji.test.http.mall.coupon
import com.meiji.biz.request.http.mall.coupon.AutoReceiveCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AutoReceiveCouponTest extends BaseTest {
    AutoReceiveCoupon autoReceiveCoupon = new AutoReceiveCoupon()
    Random random = new Random()
    @Test(description = "自动领券 autoReceiveCoupon" ,groups = ["prod","uat"],testName = "autoReceiveCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void autoReceiveCoupon(TestContext testContext){
        testContext.put("source",random.nextInt(4)+1) //1 赠送他人/购物车送礼/跳到送礼下单页 2 收礼成功 3 商详加入购物车 4 商详立即购买
        autoReceiveCoupon.invoke(testContext).baseAssert(testContext)
    }


}