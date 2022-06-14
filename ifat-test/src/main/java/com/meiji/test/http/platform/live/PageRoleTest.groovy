package com.meiji.test.http.platform.live
import com.meiji.biz.request.http.platform.live.PageRole
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageRoleTest extends BaseTest {
    PageRole pageRole = new PageRole()
    @Test(description = "查询直播成员列表 pageRole" ,groups = ["prod","uat"],testName = "pageRole",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLabel(TestContext testContext){
        pageRole.invoke(testContext).baseAssert(testContext)
        pageRole.specialAssert(testContext)
    }
}
