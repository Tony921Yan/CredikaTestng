package com.meiji.test.http.scrm.material

import com.meiji.biz.request.http.scrm.material.BatcheUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-11:22
 */
class BatcheUpdateTest extends BaseTest {
    BatcheUpdate batche = new BatcheUpdate()

    @Test(description = "批量移动", groups = ["prod", "uat"], testName = "batcheupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        batche.invoke(testContext).baseAssert(testContext)
    }
}
