package com.meiji.test.http.scrm.corp

import com.meiji.biz.request.http.scrm.corp.Index
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/20-16:00
 */
class IndexTest extends BaseTest{
    Index index = new Index()
    @Test(description = "首页 index" ,groups = ["prod","uat"],testName = "index",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        index.invoke(testContext).specialAssert(testContext)
    }
}
