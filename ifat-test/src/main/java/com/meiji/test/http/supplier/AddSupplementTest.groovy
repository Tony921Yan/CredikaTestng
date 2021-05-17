package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddSubject
import com.meiji.request.http.suppiler.AddSupplement
import org.testng.annotations.Test

class AddSupplementTest extends BaseTest {
    AddSupplement addSupplement = new AddSupplement()
    @Test(description = "添加拓展信息 addSupplement" ,groups = ["prod","uat"],testName = "addSupplement",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSupplement(TestContext testContext){
        addSupplement.invoke(testContext).baseAssert(testContext)
    }
}
