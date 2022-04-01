package com.meiji.test.http.platform.supplier
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.suppiler.AddSubject
import org.testng.annotations.Test

class AddSubjectTest extends BaseTest {
    AddSubject addSubject = new AddSubject()
    @Test(description = "新增主体信息 addSubject" ,groups = ["prod","uat"],testName = "addSubject",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSubject(TestContext testContext){
        addSubject.invoke(testContext).baseAssert(testContext)
    }
}
