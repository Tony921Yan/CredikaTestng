package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.suppiler.ProdAddShipperAddressInfo
import com.meiji.biz.request.http.platform.suppiler.ProdDeleteShipperInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdDeleteShipperInfoTest extends BaseTest {
    ProdDeleteShipperInfo prodDeleteShipperInfo = new ProdDeleteShipperInfo()
    @Test(description = "删除供应商发货地址 prodDeleteShipperInfo" ,groups = ["prod","uat"],testName = "prodDeleteShipperInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodDeleteShipperInfo(TestContext testContext){
//        prodDeleteShipperInfo.testContext.put("condition", JsonUtil.objToJsonList(testContext.get("condition")))
        prodDeleteShipperInfo.invoke(testContext).baseAssert(testContext)
    }
}