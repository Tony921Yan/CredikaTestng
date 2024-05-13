package com.credika.test.http.shop.shopinfo

import com.credika.biz.request.http.shop.shopinfo.FindShopStudyState
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopStudyStateTest extends BaseTest {
    FindShopStudyState findShopStudyState = new FindShopStudyState()
    @Test(description = "查询店铺学习状态 findShopStudyState" ,groups = ["prod","uat"],testName = "findShopStudyState1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopStudyState(TestContext testContext){
        findShopStudyState.invoke(testContext).baseAssert(testContext)
    }
}
