package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddLegal
import org.testng.annotations.Test

class AddLegalTest extends BaseTest {
    AddLegal addLegal = new AddLegal()
    @Test(description = "新增法人信息 addLegal" ,groups = ["prod","uat"],testName = "addLegal",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addLegal(TestContext testContext){
        addLegal.invoke(testContext).baseAssert(testContext)
    }
}
