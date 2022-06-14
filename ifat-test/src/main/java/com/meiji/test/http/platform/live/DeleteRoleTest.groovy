package com.meiji.test.http.platform.live
import com.meiji.biz.request.http.platform.live.DeleteRole
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteRoleTest extends BaseTest {
    DeleteRole deleteRole = new DeleteRole()
    @Test(description = "解除成员角色  deleteRole" ,groups = ["prod","uat"],testName = "deleteRole",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLabel(TestContext testContext){
        deleteRole.invoke(testContext).baseAssert(testContext)
    }
}
