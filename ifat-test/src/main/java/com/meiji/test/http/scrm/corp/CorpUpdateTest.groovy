package com.meiji.test.http.scrm.corp

import com.meiji.biz.request.http.scrm.corp.CorpUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-10:24
 */
class CorpUpdateTest extends BaseTest {
    CorpUpdate corpUpdate = new CorpUpdate()

    @Test(description = "更新企业信息", groups = ["prod", "uat"], testName = "corporate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        corpUpdate.invoke(testContext).baseAssert(testContext)
    }
}
