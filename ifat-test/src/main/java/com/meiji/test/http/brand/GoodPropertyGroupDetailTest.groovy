package com.meiji.test.http.brand

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.api.brand.GoodPropertyGroupDetail
import org.testng.annotations.Test

class GoodPropertyGroupDetailTest extends BaseTest {
    GoodPropertyGroupDetail goodPropertyGroupDetail = new GoodPropertyGroupDetail()
    @Test(description = "商品属性组详情 goodPropertyGroupDetail" ,groups = ["prod","uat"],testName = "goodPropertyGroupDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodPropertyGroupDetail(TestContext testContext){
        goodPropertyGroupDetail.invoke(testContext).baseAssert(testContext)
    }
}
