package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.PurchaseManageList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


/**
 * @author Remy*
 * @date 2022/02/23 9:45
 * @Vession V2.6
 */
class PurchaseManageListTest extends BaseTest{
    PurchaseManageList purchaseManageList = new PurchaseManageList()
    @Test(description = "purchaseManageList 采购负责人",groups = ["uat","prod"],testName = "purchaseManageList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageList(TestContext testContext){
        purchaseManageList.invoke(testContext).baseAssert(testContext)
    }
}
