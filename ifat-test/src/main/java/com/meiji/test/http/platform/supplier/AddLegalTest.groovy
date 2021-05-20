package com.meiji.test.http.platform.supplier

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.suppiler.AddLegal
import org.testng.annotations.Test

class AddLegalTest extends BaseTest {
    AddLegal addLegal = new AddLegal()
    @Test(description = "新增法人信息 addLegal" ,groups = ["prod","uat"],testName = "addLegal",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addLegal(TestContext testContext){
        addLegal.invoke(testContext).baseAssert(testContext)
    }
}
