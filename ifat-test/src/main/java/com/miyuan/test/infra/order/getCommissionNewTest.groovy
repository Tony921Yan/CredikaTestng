package com.miyuan.test.infra.order

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.infra.order.getSimpleComNew
import org.testng.annotations.Test

class getCommissionNewTest extends BaseTest{
    getSimpleComNew getSimpleComNew = new getSimpleComNew()
    @Test(description = "查询新架构收益" ,groups = ["uat","uat03"],testName = "centerGetAllNewOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCommissionNewSuccess(TestContext testContext){
        getSimpleComNew.invoke(testContext)
        getSimpleComNew.baseAssert(testContext)
        getSimpleComNew.commissionAssert(testContext)

    }

}


