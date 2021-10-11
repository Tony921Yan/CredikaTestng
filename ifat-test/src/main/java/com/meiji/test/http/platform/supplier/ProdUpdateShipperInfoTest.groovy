package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.suppiler.ProdDeleteShipperInfo
import com.meiji.biz.request.http.platform.suppiler.ProdUpdateShipperInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdUpdateShipperInfoTest extends BaseTest {
    ProdUpdateShipperInfo prodUpdateShipperInfo = new ProdUpdateShipperInfo()
    @Test(description = "更新发货联系人信息 prodUpdateShipperInfo" ,groups = ["prod","uat"],testName = "prodUpdateShipperInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodUpdateShipperInfo(TestContext testContext){
        testContext.replace("id",523)
        testContext.replace("supplierId",319)
        testContext.replace("isDefault",0)
//        prodUpdateShipperInfo.testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        prodUpdateShipperInfo.invoke(testContext).baseAssert(testContext)
    }
}