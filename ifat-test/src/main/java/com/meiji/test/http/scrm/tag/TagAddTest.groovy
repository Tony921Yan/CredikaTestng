package com.meiji.test.http.scrm.tag

import com.meiji.biz.request.http.scrm.tag.TagAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-15:51
 */
class TagAddTest extends BaseTest {
    TagAdd tag = new TagAdd()

    @Test(description = "添加标签", groups = ["prod", "uat"], testName = "tagadd",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tag.invoke(testContext).baseAssert(testContext)
    }
}
