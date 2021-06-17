package com.meiji.test.http.OMS.supplier

import com.meiji.biz.request.http.OMS.supplier.GetSupplierDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierDetailTest extends BaseTest {
    GetSupplierDetail getSupplierDetail = new GetSupplierDetail()
    @Test(description = "获取供应商详情 getSupplierDetail" ,groups = ["prod","uat"],testName = "OMSgetSupplierDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierDetail(TestContext testContext){
        getSupplierDetail.invoke(testContext).baseAssert(testContext)
    }
}
