package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.AuditGoods
import com.meiji.biz.request.http.platform.goods.PublishBack
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PublishBackTest extends BaseTest {//status由4变为3
    PublishBack publishBack = new PublishBack()
    @Test(description = "发布撤回 publishBack" ,groups = ["prod","uat"],testName = "publishBack",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishBack(TestContext testContext){
        publishBack.invoke(testContext).baseAssert(testContext)
    }
}
