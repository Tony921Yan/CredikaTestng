package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.Detail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DetailTest extends BaseTest {
    Detail detail = new Detail()
    @Test(description = "活动详情-领券活动 detail" ,groups = ["prod","uat"],testName = "activeMainManage.detail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

}