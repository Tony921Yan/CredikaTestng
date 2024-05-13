package com.credika.test.http.platform.live
import com.credika.biz.request.http.platform.live.EditRole
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class EditRoleTest extends BaseTest {
    EditRole editRole = new EditRole()
    @Test(description = "设置直播成员角色 editRole" ,groups = ["prod","uat"],testName = "editRole",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLabel(TestContext testContext){
        editRole.invoke(testContext).baseAssert(testContext)
    }
}
