package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.suppiler.GetSupplierDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierDetailTest extends BaseTest {
    GetSupplierDetail getSupplierDetail = new GetSupplierDetail()
    @Test(description = "获取供应商详情 getSupplierDetail" ,groups = ["prod","uat"],testName = "getSupplierDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierDetail(TestContext testContext){
        getSupplierDetail.invoke(testContext).baseAssert(testContext)
    }
}
