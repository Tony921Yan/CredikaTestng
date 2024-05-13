package com.credika.test.http.mall.userShop

import com.credika.biz.request.http.mall.userShop.OpenShop
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2022-3-20 00:18
 @version v2.6.3
 */
class CardShopTest extends BaseTest{
    OpenShop openShop = new OpenShop()
    @Test(description = "开店 openShop" ,groups = ["prod","uat"],testName = "openShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void openShop(TestContext testContext){
        openShop.invoke(testContext).baseAssert(testContext)
    }

}
