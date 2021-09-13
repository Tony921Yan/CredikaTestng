package com.meiji.test.http.scrm.contacttag

import com.meiji.biz.request.http.scrm.contacttag.ContactTagUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-10:34
 */
class ContactTagUpdateTest extends BaseTest {
    ContactTagUpdate contactTagUpdate = new ContactTagUpdate()

    @Test(description = "修改客户标签", groups = ["prod", "uat"], testName = "contactupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        contactTagUpdate.invoke(testContext).baseAssert(testContext)
    }
}
