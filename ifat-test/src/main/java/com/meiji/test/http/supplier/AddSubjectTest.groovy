package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddSubject
import org.testng.annotations.Test

class AddSubjectTest extends BaseTest {
    AddSubject addSubject = new AddSubject()
    @Test(description = "新增主体信息 addSubject" ,groups = ["prod","uat"],testName = "addSubject",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSubject(TestContext testContext){
        addSubject.invoke(testContext).baseAssert(testContext)
    }
}
