package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.ConfirmReceipt
import com.meiji.request.http.mall.PostReturnLogisticsInformation
import org.testng.annotations.Test

class PostReturnLogisticsInformationTest extends BaseTest {
    PostReturnLogisticsInformation postReturnLogisticsInformation = new PostReturnLogisticsInformation()
    @Test(description = "回填物流信息 postReturnLogisticsInformation" ,groups = ["prod","uat"],testName = "postReturnLogisticsInformation",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void postReturnLogisticsInformation(TestContext testContext){
        postReturnLogisticsInformation.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
