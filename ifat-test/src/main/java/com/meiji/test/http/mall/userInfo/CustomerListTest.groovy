package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.CustomerList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CustomerListTest extends BaseTest {
    CustomerList customerList = new CustomerList()
    @Test(description = "查询店铺顾客列表 customerList" ,groups = ["prod","uat"],testName = "customerList-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void customerList(TestContext testContext){
        customerList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "顾客管理-最近访问时间 customerList1-mall",groups = ["prod","uat"],testName = "customerList1-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void customerList1(TestContext testContext){
        customerList.invoke(testContext).baseAssert(testContext)
    }
}
