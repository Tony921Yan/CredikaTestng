package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.MerchantManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MerchantManageTest extends BaseTest {
    MerchantManage merchantManage = new MerchantManage()
    @Test(description = "商家管理 merchantManage" ,groups = ["prod","uat"],testName = "merchantManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void invitationCodeList(TestContext testContext){
        merchantManage.invoke(testContext).baseAssert(testContext)
        merchantManage.specialAssert(testContext)
    }
}
