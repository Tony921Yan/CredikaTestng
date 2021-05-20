package com.meiji.test.http.platform.supplier

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.suppiler.AddSupplement
import org.testng.annotations.Test

class AddSupplementTest extends BaseTest {
    AddSupplement addSupplement = new AddSupplement()
    @Test(description = "添加拓展信息 addSupplement" ,groups = ["prod","uat"],testName = "addSupplement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSupplement(TestContext testContext){
        addSupplement.invoke(testContext).baseAssert(testContext)
    }
}
