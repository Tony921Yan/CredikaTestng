package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.PurchaseManageDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/23 17:41
 * @Vession V2.6
 */
class PurchaseManageDelTest extends BaseTest{
    PurchaseManageDel purchaseManageDel = new PurchaseManageDel()
    @Test(description = "purchaseManageDel 采购负责人删除",groups = ["uat","prod"],testName = "purchaseManageDel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageDel(TestContext testContext){
        purchaseManageDel.invoke(testContext).baseAssert(testContext)
    }
}
