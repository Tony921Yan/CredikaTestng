package com.meiji.test.http.OMS.supplier


import com.meiji.biz.request.http.OMS.supplier.GetSupplierInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierInfoTest extends BaseTest {
    GetSupplierInfo getSupplierInfo = new GetSupplierInfo()
    @Test(description = "获取供应商基础信息 getSupplierInfo" ,groups = ["prod","uat"],testName = "OMSgetSupplierInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierInfo(TestContext testContext){
        getSupplierInfo.invoke(testContext).baseAssert(testContext)
    }
}
