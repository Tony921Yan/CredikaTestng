package com.credika.test.http.scrm.material

import com.credika.biz.request.http.scrm.material.BatcheDelete
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-11:17
 */
class BatcheDeleteTest extends BaseTest {
    BatcheDelete batche = new BatcheDelete()

    @Test(description = "批量删除", groups = ["prod", "uat"], testName = "batchedel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        batche.invoke(testContext).baseAssert(testContext)
    }
}
