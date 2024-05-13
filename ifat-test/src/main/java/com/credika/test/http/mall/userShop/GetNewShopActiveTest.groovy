package com.credika.test.http.mall.userShop

import com.credika.biz.request.http.mall.userShop.GetNewShopActive
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-13:50
 @version v2.1
 */
class GetNewShopActiveTest extends BaseTest{
    GetNewShopActive getNewShopActive = new GetNewShopActive()
   @Test(description = "查询店长新人活动 getNewShopActive" ,groups = ["prod","uat"],testName = "getNewShopActive",
                   dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getNewShopActive(TestContext testContext){
        getNewShopActive.invoke(testContext).baseAssert(testContext)
    }

}
