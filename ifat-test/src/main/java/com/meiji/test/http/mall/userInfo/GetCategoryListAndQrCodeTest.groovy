package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GetCategoryListAndQrCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCategoryListAndQrCodeTest extends BaseTest {
    GetCategoryListAndQrCode getCategoryListAndQrCode = new GetCategoryListAndQrCode()
    @Test(description = "平台客服 getCategoryListAndQrCode" ,groups = ["prod","uat"],testName = "getCategoryListAndQrCode",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryListAndQrCode(TestContext testContext){
        getCategoryListAndQrCode.invoke(testContext).baseAssert(testContext)
    }
}
