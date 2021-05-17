package com.meiji.test.http.supplier

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.suppiler.AddAdministrator
import org.testng.annotations.Test

class AddAdministratorTest extends BaseTest {
    AddAdministrator addAdministrator = new AddAdministrator()
    @Test(description = "添加管理员信息 addAdministrator" ,groups = ["prod","uat"],testName = "addAdministrator",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addAdministrator(TestContext testContext){
        addAdministrator.invoke(testContext).baseAssert(testContext)
    }
}
