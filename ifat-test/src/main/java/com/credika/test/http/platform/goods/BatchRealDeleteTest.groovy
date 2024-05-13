package com.credika.test.http.platform.goods


import com.credika.biz.request.http.platform.goods.BatchRealDelete
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class BatchRealDeleteTest extends BaseTest {
    BatchRealDelete batchRealDelete = new BatchRealDelete()
    @Test(description = "彻底删除商品 batchRealDelete" ,groups = ["prod","uat"],testName = "batchRealDelete",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void batchRealDelete(TestContext testContext){
        batchRealDelete.invoke(testContext).baseAssert(testContext)
    }
}
