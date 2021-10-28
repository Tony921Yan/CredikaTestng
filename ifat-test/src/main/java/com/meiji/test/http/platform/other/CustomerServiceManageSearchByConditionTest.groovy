package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.CustomerServiceManageSearchByCondition
import com.meiji.biz.request.http.platform.other.FindDealerPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CustomerServiceManageSearchByConditionTest extends BaseTest {
    CustomerServiceManageSearchByCondition customerServiceManageSearchByCondition = new CustomerServiceManageSearchByCondition()
    @Test(description = "查询客服信息分页 customerServiceManageSearchByCondition" ,groups = ["prod","uat"],testName = "customerServiceManageSearchByCondition",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void customerServiceManageSearchByCondition(TestContext testContext){
        customerServiceManageSearchByCondition.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
