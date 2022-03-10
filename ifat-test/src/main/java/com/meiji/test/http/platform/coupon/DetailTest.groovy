package com.meiji.test.http.platform.coupon

import com.meiji.biz.request.http.platform.coupon.Detail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DetailTest extends BaseTest {
    Detail detail = new Detail()
    @Test(description = "优惠券详情 detail" ,groups = ["prod","uat"],testName = "detail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

}