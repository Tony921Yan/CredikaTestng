package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.GetAfterLog
import com.meiji.request.http.shop.GetAfterOrderDetail
import org.testng.annotations.Test

class GetAfterOrderDetailTest extends BaseTest {
    GetAfterOrderDetail getAfterOrderDetail = new GetAfterOrderDetail()
    @Test(description = "获取售后单详情 getAfterOrderDetail" ,groups = ["prod","uat"],testName = "getAfterOrderDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAfterOrderDetail(TestContext testContext){
        getAfterOrderDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
