package com.meiji.test.http.platform.member
import com.meiji.biz.request.http.platform.member.FindUserPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUserPageTest extends BaseTest {
    FindUserPage findUserPage = new FindUserPage()
    @Test(description = "查询会员分页 findUserPage" ,groups = ["prod","uat"],testName = "findUserPage",
           dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserPage(TestContext testContext){
        findUserPage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
