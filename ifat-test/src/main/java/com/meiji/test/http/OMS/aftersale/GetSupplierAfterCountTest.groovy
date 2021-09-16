package com.meiji.test.http.OMS.aftersale

import com.meiji.biz.request.http.OMS.aftersale.GetSupplierAfterCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierAfterCountTest extends BaseTest {
   GetSupplierAfterCount getSupplierAfterCount = new GetSupplierAfterCount()
    @Test(description = "售后红点计数 getSupplierAfterCount" ,groups = ["prod","uat"],testName = "OMSgetSupplierAfterCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierAfterCount(TestContext testContext){
        getSupplierAfterCount.invoke(testContext).baseAssert(testContext)
    }
}
