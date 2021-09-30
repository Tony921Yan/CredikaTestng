package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.CustomerServiceManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CustomerServiceManageTest extends BaseTest {
    CustomerServiceManage customerServiceManage = new CustomerServiceManage()
    @Test(description = "客服信息 customerServiceManage" ,groups = ["prod","uat"],testName = "customerServiceManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void customerServiceManage(TestContext testContext){
        testContext.put("status","0")
        testContext.put("page","1")
        testContext.put("rows","20")
        customerServiceManage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
