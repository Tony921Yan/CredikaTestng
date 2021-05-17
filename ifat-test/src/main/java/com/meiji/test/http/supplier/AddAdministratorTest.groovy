package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddAdministrator
import org.testng.annotations.Test

class AddAdministratorTest extends BaseTest {
    AddAdministrator addAdministrator = new AddAdministrator()
    @Test(description = "添加管理员信息 addAdministrator" ,groups = ["prod","uat"],testName = "addAdministrator",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addAdministrator(TestContext testContext){
        addAdministrator.invoke(testContext).baseAssert(testContext)
    }
}
