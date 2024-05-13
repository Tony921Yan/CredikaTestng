package com.credika.test.http.scrm.tagGroup

import com.credika.biz.request.http.scrm.tagGroup.TagGroupQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:28
 */
class TagGroupQueryTest extends BaseTest {
    TagGroupQuery tagGroupQuery = new TagGroupQuery()

    @Test(description = "查看标签分组", groups = ["prod", "uat"], testName = "tagGroup",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tagGroupQuery.invoke(testContext).baseAssert(testContext)
    }
}
