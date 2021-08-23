package com.meiji.test.http.scrm.tag

import com.meiji.biz.request.http.scrm.tag.TagList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:18
 */
class TagListTest extends BaseTest {
    TagList tagList = new TagList()

    @Test(description = "查看标签列表", groups = ["prod", "uat"], testName = "tagList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tagList.invoke(testContext).baseAssert(testContext)
    }
}
