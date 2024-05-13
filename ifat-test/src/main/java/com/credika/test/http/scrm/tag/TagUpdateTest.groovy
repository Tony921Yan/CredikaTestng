package com.credika.test.http.scrm.tag

import com.credika.biz.request.http.scrm.tag.TagUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-16:15
 */
class TagUpdateTest extends BaseTest {
    TagUpdate tag = new TagUpdate()

    @Test(description = "修改标签", groups = ["prod", "uat"], testName = "tagupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tag.invoke(testContext).baseAssert(testContext)
    }
}
