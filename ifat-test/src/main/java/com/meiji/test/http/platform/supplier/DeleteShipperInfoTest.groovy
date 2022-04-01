package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.DeleteShipperInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteShipperInfoTest extends BaseTest {
    DeleteShipperInfo deleteShipperInfo = new DeleteShipperInfo()
    @Test(description = "删除供应商发货地址 prodDeleteShipperInfo" ,groups = ["prod","uat"],testName = "deleteShipperInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteShipperInfo(TestContext testContext){
        deleteShipperInfo.invoke(testContext).baseAssert(testContext)
    }
}