package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.FindUseridentityInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindUseridentityInfoTest extends BaseTest {
    FindUseridentityInfo findUseridentityInfo = new FindUseridentityInfo()
    @Test(description = "查询当前用户信息（新接口） findUseridentityInfo" ,groups = ["prod","uat"],testName = "findUseridentityInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUseridentityInfo(TestContext testContext){
        findUseridentityInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
