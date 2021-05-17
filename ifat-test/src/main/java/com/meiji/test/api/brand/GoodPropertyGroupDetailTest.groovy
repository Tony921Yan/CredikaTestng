package com.meiji.test.api.brand


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodPropertyGroupDetailTest extends BaseTest {
    com.meiji.biz.request.api.brand.GoodPropertyGroupDetail goodPropertyGroupDetail = new com.meiji.biz.request.api.brand.GoodPropertyGroupDetail()
    @Test(description = "商品属性组详情 goodPropertyGroupDetail" ,groups = ["prod","uat"],testName = "goodPropertyGroupDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodPropertyGroupDetail(TestContext testContext){
        goodPropertyGroupDetail.invoke(testContext).baseAssert(testContext)
    }
}
