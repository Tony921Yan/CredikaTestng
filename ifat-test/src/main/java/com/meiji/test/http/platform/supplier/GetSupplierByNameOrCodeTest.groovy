package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.suppiler.GetSupplierByNameOrCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierByNameOrCodeTest extends BaseTest {
    GetSupplierByNameOrCode getSupplierByNameOrCode = new GetSupplierByNameOrCode()
    @Test(description = "根据名字或者编码获取供应商 getSupplierByNameOrCode" ,groups = ["prod","uat"],testName = "getSupplierByNameOrCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierByNameOrCode(TestContext testContext){
        getSupplierByNameOrCode.invoke(testContext).baseAssert(testContext)
    }
}
