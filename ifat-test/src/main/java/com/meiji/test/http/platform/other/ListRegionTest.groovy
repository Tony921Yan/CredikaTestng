package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.ListRegion
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListRegionTest extends BaseTest {
    ListRegion listRegion = new ListRegion()
    @Test(description = "三级联动地址 listRegion" ,groups = ["prod","uat"],testName = "listRegion",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listRegion(TestContext testContext){
        listRegion.invoke(testContext).baseAssert(testContext)
    }
}
