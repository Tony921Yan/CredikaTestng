package com.credika.test.http.platform.supplier


import com.credika.biz.request.http.platform.suppiler.GetSupplierInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierInfoTest extends BaseTest {
    GetSupplierInfo getSupplierInfo = new GetSupplierInfo()
    @Test(description = "根据供应商code获取供应商信息 getSupplierInfo" ,groups = ["prod","uat"],testName = "getSupplierInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierInfo(TestContext testContext){
        getSupplierInfo.invoke(testContext).baseAssert(testContext)
    }
}
