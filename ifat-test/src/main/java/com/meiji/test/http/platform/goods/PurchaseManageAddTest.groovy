package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.PurchaseManageAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/23 14:25
 * @Vession V2.6
 */
class PurchaseManageAddTest extends BaseTest{
    PurchaseManageAdd purchaseManageAdd = new PurchaseManageAdd()
    @Test(description = "purchaseManageAdd 新增采购人",groups = ["uat","prod"],testName = "purchaseManageAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageAdd(TestContext testContext){
        purchaseManageAdd.invoke(testContext).baseAssert(testContext)
    }
}
