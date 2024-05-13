package com.credika.test.http.platform.couponManage

import com.credika.biz.request.http.platform.couponManage.AddCouponNum
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddCouponNumTest extends BaseTest {
    AddCouponNum addCouponNum = new AddCouponNum()
    @Test(description = "优惠券增发 addCouponNum" ,groups = ["prod","uat"],testName = "addCouponNum",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCouponNum(TestContext testContext){
        testContext.put("id",1471165365223487)
        testContext.put("num",1)
        addCouponNum.invoke(testContext).baseAssert(testContext)
    }

}