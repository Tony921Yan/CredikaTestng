package com.credika.test.http.platform.supplier


import com.credika.biz.request.http.platform.suppiler.UpdateSupplement
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateSupplementTest extends BaseTest {
    UpdateSupplement updateSupplement = new UpdateSupplement()
    @Test(description = "更新拓展信息 updateSupplement" ,groups = ["prod","uat"],testName = "updateSupplement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateSupplement(TestContext testContext){
        updateSupplement.invoke(testContext).baseAssert(testContext)
    }
}
