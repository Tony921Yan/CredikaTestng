package com.meiji.test.http.platform.marketingManagement

import com.meiji.biz.request.http.platform.marketingManagement.ActiveManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ActiveManageTest extends BaseTest {
    ActiveManage activeManage = new ActiveManage()
    @Test(description = "限时秒杀 activeManage" ,groups = ["prod","uat"],testName = "activeManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeManage(TestContext testContext){
        activeManage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
