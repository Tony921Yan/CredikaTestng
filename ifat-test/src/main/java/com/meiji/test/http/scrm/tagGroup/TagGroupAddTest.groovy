package com.meiji.test.http.scrm.tagGroup

import com.meiji.biz.request.http.scrm.tagGroup.TagGroupAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-16:29
 */
class TagGroupAddTest extends BaseTest {
    TagGroupAdd tag = new TagGroupAdd()

    @Test(description = "添加标签分组", groups = ["prod", "uat"], testName = "taggroupadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tag.invoke(testContext).baseAssert(testContext)
    }
}
