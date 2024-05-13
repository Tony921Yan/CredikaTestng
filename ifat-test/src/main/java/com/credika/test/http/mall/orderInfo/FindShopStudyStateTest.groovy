package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.FindShopStudyState
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopStudyStateTest extends BaseTest {
    FindShopStudyState findShopStudyState = new FindShopStudyState()
    @Test(description = "新手教程 findShopStudyState" ,groups = ["prod","uat"],testName = "findShopStudyState",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopStudyState(TestContext testContext){
        testContext.put("id",1405981112139808)
        findShopStudyState.invoke(testContext).baseAssert(testContext)
    }
}
