package com.credika.test.http.platform.shopManager


import com.credika.biz.request.http.platform.shopmanager.UpdateShopAuditState
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShopAuditStateTest extends BaseTest { //已审核无效即shop表中audit_state不等于20且auth_state为40
    UpdateShopAuditState updateShopAuditState = new UpdateShopAuditState()
    @Test(description = "更新店铺审核状态 updateShopAuditState" ,groups = ["prod","uat"],testName = "updateShopAuditState",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShopAuditState(TestContext testContext){
        updateShopAuditState.invoke(testContext).baseAssert(testContext)
    }
}
