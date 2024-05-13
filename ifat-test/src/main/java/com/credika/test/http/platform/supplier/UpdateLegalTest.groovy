package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.UpdateLegal
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateLegalTest extends BaseTest {
    UpdateLegal updateLegal = new UpdateLegal()
    @Test(description = "更新法人信息 updateLegal" ,groups = ["prod","uat"],testName = "updateLegal",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateLegal(TestContext testContext){
        updateLegal.invoke(testContext).baseAssert(testContext)
    }
}
