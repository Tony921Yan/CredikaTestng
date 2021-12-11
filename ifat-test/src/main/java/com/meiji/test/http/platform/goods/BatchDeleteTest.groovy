package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.BatchDelete
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class BatchDeleteTest extends BaseTest {
    BatchDelete batchDelete = new BatchDelete()
    @Test(description = "删除商品 batchDelete" ,groups = ["prod","uat"],testName = "batchDelete",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void batchDelete(TestContext testContext){
        testContext.put("spuId","1425511242792992")
        batchDelete.invoke(testContext).baseAssert(testContext)
    }
}
