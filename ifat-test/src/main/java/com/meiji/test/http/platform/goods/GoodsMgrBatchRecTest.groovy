package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.GoodsMgrBatchRec
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/03/17 18:51
 * @Vession update from history version
 * */
class GoodsMgrBatchRecTest extends BaseTest{
    GoodsMgrBatchRec goodsMgrBatchRec = new GoodsMgrBatchRec()
    @Test(description = "恢复已删除商品 goodsMgrBatchRec",groups = ["uat","prod"],testName = "goodsMgrBatchRec",
        dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsMgrBatchRec(TestContext testContext){
        goodsMgrBatchRec.invoke(testContext).baseAssert(testContext)
    }
}
