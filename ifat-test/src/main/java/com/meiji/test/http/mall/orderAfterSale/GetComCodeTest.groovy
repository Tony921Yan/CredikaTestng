package com.meiji.test.http.mall.orderAfterSale

import com.meiji.biz.request.http.mall.orderAfterSale.ApplyAfterSale
import com.meiji.biz.request.http.mall.orderAfterSale.GetComCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetComCodeTest extends BaseTest {
     GetComCode getComCode = new GetComCode()
    @Test(description = "快递单号 getComCode" ,groups = ["prod","uat"],testName = "getComCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getComCode(TestContext testContext){
        getComCode.invoke(testContext).baseAssert(testContext)
    }
}
