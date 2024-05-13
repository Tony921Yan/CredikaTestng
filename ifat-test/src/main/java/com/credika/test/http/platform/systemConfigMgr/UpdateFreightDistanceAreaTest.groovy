package com.credika.test.http.platform.systemConfigMgr
import com.credika.biz.request.http.platform.systemConfigMgr.UpdateFreightDistanceArea
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateFreightDistanceAreaTest extends BaseTest {
    UpdateFreightDistanceArea updateFreightDistanceArea = new UpdateFreightDistanceArea()
    @Test(description = "添加偏远地区设置 updateFreightDistanceArea" ,groups = ["prod","uat"],testName = "updateFreightDistanceArea",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateFreightDistanceArea(TestContext testContext){
        updateFreightDistanceArea.invoke(testContext).baseAssert(testContext)
    }
}
