package com.credika.test.http.platform.couponManage

import com.credika.biz.request.http.platform.couponManage.CouponInstanceListByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CouponInstanceListByPageTest extends BaseTest {
    CouponInstanceListByPage couponInstanceListByPage = new CouponInstanceListByPage()
    Random rand = new Random()
    @Test(description = "优惠券明细-全部 couponInstanceListByPage" ,groups = ["prod","uat"],testName = "couponInstanceListByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponInstanceListByPage(TestContext testContext){
        couponInstanceListByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "优惠券明细-使用状态查询 couponInstanceListByPage" ,groups = ["prod","uat"],testName = "couponInstanceListByPage1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponInstanceListByPage1(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("status", rand.nextInt(3)+1)    //1.未使用；2.已使用; 3.已过期
        couponInstanceListByPage.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "优惠券明细-活动名称查询 couponInstanceListByPage" ,groups = ["prod","uat"],testName = "couponInstanceListByPage2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponInstanceListByPage2(TestContext testContext){
        couponInstanceListByPage.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "优惠券明细-领取时间查询 couponInstanceListByPage" ,groups = ["prod","uat"],testName = "couponInstanceListByPage3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void couponInstanceListByPage3(TestContext testContext){
        couponInstanceListByPage.invoke(testContext).baseAssert(testContext)
    }



}