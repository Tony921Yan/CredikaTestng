package com.credika.test.http.platform.brand

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.brand.GoodPropertyGroupDetail
import org.testng.annotations.Test

class GoodPropertyGroupDetailTest extends BaseTest {
    GoodPropertyGroupDetail goodPropertyGroupDetail = new GoodPropertyGroupDetail()
    @Test(description = "商品属性组详情 goodPropertyGroupDetail" ,groups = ["prod","uat"],testName = "goodPropertyGroupDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodPropertyGroupDetail(TestContext testContext){
        goodPropertyGroupDetail.invoke(testContext).baseAssert(testContext)
    }
}
