package com.meiji.test.http.mall.user

import com.meiji.biz.request.http.mall.user.CheckGrayUser
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CheckGrayUserTest extends BaseTest {
    CheckGrayUser checkGrayUser = new CheckGrayUser()
    @Test(description = "灰度用户检查" ,groups = ["prod","uat"],testName = "mallCheckGrayUser",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGrayUser_true(TestContext testContext){
        checkGrayUser.invoke(testContext).baseAssert(testContext)
        assert testContext.getResponse().data == true
    }

    @Test(description = "灰度用户检查" ,groups = ["prod","uat"],testName = "mallCheckGrayUser_false",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void checkGrayUser_false(TestContext testContext){
        checkGrayUser.invoke(testContext).baseAssert(testContext)
        assert testContext.getResponse().data == false
    }
}
