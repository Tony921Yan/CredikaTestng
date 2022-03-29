package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.UpdateSubject
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateSubjectTest extends BaseTest {
    UpdateSubject updateSubject = new UpdateSubject()
    @Test(description = "更新主体信息 updateSubject" ,groups = ["prod","uat"],testName = "updateSubject",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateSubject(TestContext testContext){
        updateSubject.invoke(testContext).baseAssert(testContext)
    }
}
