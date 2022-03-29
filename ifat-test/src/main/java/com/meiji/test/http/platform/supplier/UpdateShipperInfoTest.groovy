package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.UpdateShipperInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateShipperInfoTest extends BaseTest {
    UpdateShipperInfo updateShipperInfo = new UpdateShipperInfo()
    @Test(description = "更新发货联系人信息 updateShipperInfo" ,groups = ["prod","uat"],testName = "updateShipperInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateShipperInfo(TestContext testContext){
        testContext.put("id",2);
        testContext.put("supplierId",12);
        testContext.put("isDefault",1);
        updateShipperInfo.invoke(testContext).baseAssert(testContext)
    }
}