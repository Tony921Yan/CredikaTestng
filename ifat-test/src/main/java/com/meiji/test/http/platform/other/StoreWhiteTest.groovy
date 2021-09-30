package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.StoreWhite
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class StoreWhiteTest extends BaseTest {
    StoreWhite storeWhite = new StoreWhite()
    @Test(description = "店铺白名单 storeWhite" ,groups = ["prod","uat"],testName = "storeWhite",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void storeWhite(TestContext testContext){
        storeWhite.invoke(testContext).baseAssert(testContext)
        storeWhite.specialAssert(testContext)

    }
}
