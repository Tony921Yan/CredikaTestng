package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.UpdateAdministrator
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateAdministratorTest extends BaseTest {
    UpdateAdministrator updateAdministrator = new UpdateAdministrator()
    @Test(description = "更新管理员信息 updateSubject" ,groups = ["prod","uat"],testName = "updateAdministrator",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateAdministrator(TestContext testContext){
        updateAdministrator.invoke(testContext).baseAssert(testContext)
    }
}