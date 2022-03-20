package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.BatchRec
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class BatchRecTest extends BaseTest {
    BatchRec batchRec = new BatchRec()
    @Test(description = "恢复商品 batchRec" ,groups = ["prod","uat"],testName = "batchRec",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void batchRec(TestContext testContext){
        batchRec.invoke(testContext).baseAssert(testContext)
    }
}
