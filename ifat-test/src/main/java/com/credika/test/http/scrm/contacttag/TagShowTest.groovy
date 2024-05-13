package com.credika.test.http.scrm.contacttag

import com.credika.biz.request.http.scrm.contacttag.TagShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-10:24
 */
class TagShowTest extends BaseTest {
    TagShow tagShow = new TagShow()
    @Test(description = "查看客户标签明细", groups = ["prod", "uat"], testName = "tagshow",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        tagShow.invoke(testContext).baseAssert(testContext)
    }
}
