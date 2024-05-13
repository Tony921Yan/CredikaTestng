package com.credika.test.http.platform.systemConfigMgr
import com.credika.biz.request.http.platform.systemConfigMgr.UpdateSearchKeyNew
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateSearchKeyNewTest extends BaseTest {
    UpdateSearchKeyNew updateSearchKeyNew = new UpdateSearchKeyNew()
    @Test(description = "更新搜索关键字（新） updateSearchKeyNew" ,groups = ["prod","uat"],testName = "updateSearchKeyNew",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateSearchKeyNew(TestContext testContext){
        updateSearchKeyNew.invoke(testContext).baseAssert(testContext)
    }
}
