package com.credika.test.http.scrm.tag

import com.credika.biz.request.http.scrm.tag.TagDestroy
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/17-16:09
 */
class TagDestroyTest extends BaseTest {
    TagDestroy tag = new TagDestroy()

    @Test(description = "删除标签", groups = ["prod", "uat"], testName = "tagdel",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tag.invoke(testContext).specialAssert(testContext)
    }
}
