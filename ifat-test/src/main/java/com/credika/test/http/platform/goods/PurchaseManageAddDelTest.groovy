package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.PurchaseManageAdd
import com.credika.biz.request.http.platform.goods.PurchaseManageDel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/23 17:41
 * @Vession V2.6
 */
class PurchaseManageAddDelTest extends BaseTest{
    String id;
    PurchaseManageAdd purchaseManageAdd = new PurchaseManageAdd()
    @Test(description = "purchaseManageAdd 新增采购人",groups = ["uat","prod"],testName = "purchaseManageAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageAdd(TestContext testContext){
        purchaseManageAdd.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        id = testContext.get("id",id)
        System.out.println("拿到mysql的id:" + id)
    }
    PurchaseManageDel purchaseManageDel = new PurchaseManageDel()
    @Test(description = "purchaseManageDel 采购负责人删除",groups = ["uat","prod"],testName = "purchaseManageDel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void purchaseManageDel(TestContext testContext){
        testContext.put("id",id)
        purchaseManageDel.invoke(testContext).baseAssert(testContext)
    }
}
