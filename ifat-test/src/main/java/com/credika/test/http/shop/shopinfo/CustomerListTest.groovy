package com.credika.test.http.shop.shopinfo

import com.credika.biz.request.http.shop.shopinfo.CustomerList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CustomerListTest extends BaseTest {
    CustomerList customerList = new CustomerList()
    @Test(description = "查询店铺顾客列表 customerList" ,groups = ["prod","uat"],testName = "customerList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void customerList(TestContext testContext){
        customerList.invoke(testContext).baseAssert(testContext)
    }
}
