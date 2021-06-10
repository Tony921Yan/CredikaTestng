package com.meiji.test.http.platform.shopmanager


import com.meiji.biz.request.http.platform.shopmanager.FindShopDetail
import com.meiji.biz.request.http.platform.shopmanager.UpdateBankCardInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateBankCardInfoTest extends BaseTest {
    UpdateBankCardInfo updateBankCardInfo = new UpdateBankCardInfo()
    @Test(description = "更新银行卡-结算信息 updateBankCardInfo" ,groups = ["prod","uat"],testName = "updateBankCardInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateBankCardInfo(TestContext testContext){
        updateBankCardInfo.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
