package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PostReturnLogisticsInformationTest extends BaseTest {
    com.meiji.biz.request.http.mall.PostReturnLogisticsInformation postReturnLogisticsInformation = new com.meiji.biz.request.http.mall.PostReturnLogisticsInformation()
    @Test(description = "回填物流信息 postReturnLogisticsInformation" ,groups = ["prod","uat"],testName = "postReturnLogisticsInformation",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void postReturnLogisticsInformation(TestContext testContext){
        postReturnLogisticsInformation.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
