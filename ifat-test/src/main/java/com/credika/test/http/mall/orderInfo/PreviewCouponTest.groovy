package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.PreviewCoupon
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy*
 * @date 2022/03/18 12:07
 * @Vession v2.6.3
 * */
class PreviewCouponTest extends BaseTest {
    PreviewCoupon previewCoupon = new PreviewCoupon()
    @Test(description = "预览优惠券 previewCoupon" ,groups = ["prod","uat"],testName = "previewCoupon",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewCoupon(TestContext testContext){
        previewCoupon.invoke(testContext).baseAssert(testContext)
    }
}
