package com.meiji.test.http.scrm.tag;

import com.meiji.biz.request.http.scrm.tag.TagQuery;
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test;

/**
 * @author s1mple
 * @create 2021/8/23-16:22
 */
class TagQueryTest extends BaseTest {
    TagQuery tagQuery = new TagQuery();

    @Test(description = "查看标签分组下的标签", groups = ["prod", "uat"], testName = "tagquery",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tagQuery.invoke(testContext).baseAssert(testContext)
    }
}
