package com.credika.test.http.mall.userShop

import com.credika.biz.request.http.mall.userShop.OneStepOpenShop
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2022-3-20 00:1
 @version v2.6.3
 */
class OneStepCardShopTest extends BaseTest{
    OneStepOpenShop oneStepOpenShop = new OneStepOpenShop()
    @Test(description = "一键开店-已有店铺（失败） oneStepOpenShop" ,groups = ["prod","uat"],testName = "oneStepOpenShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void oneStepOpenShop(TestContext testContext){
        oneStepOpenShop.invoke(testContext).baseAssert(testContext)
    }

}
