package com.miyuan.test.api.marketing

import com.miyuan.com.BaseTest
import com.miyuan.com.TestContext
import com.miyuan.com.TestData
import com.miyuan.request.api.marketing.CenterGetmarketingList
import org.testng.annotations.Test

class CenterGetMrkingtTest extends BaseTest{
    CenterGetmarketingList centerGetmarketingList = new CenterGetmarketingList()
    @Test(description = "查询全部订单" ,groups = ["prod","prod"],testName = "centerGetAllOrderListSuccess",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void centerGetFailOrderListSuccess(TestContext testContext){
        testContext.put("activityId","25")
        centerGetmarketingList.invoke(testContext)
        centerGetmarketingList.sumredMoneylAssert(testContext)
    }
}


