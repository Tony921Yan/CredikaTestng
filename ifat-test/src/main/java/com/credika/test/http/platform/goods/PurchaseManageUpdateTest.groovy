package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.PurchaseManageUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/23 17:27
 * @Vession V2.6
 */
class PurchaseManageUpdateTest extends BaseTest{
    PurchaseManageUpdate purchaseManageUpdate = new PurchaseManageUpdate()
    @Test(description = "purchaseManageUpdate 采购负责人更新",groups = ["uat","prod"],testName = "purchaseManageUpdate",
        dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageUpdate(TestContext testContext){
        purchaseManageUpdate.invoke(testContext).baseAssert(testContext)
    }
}
