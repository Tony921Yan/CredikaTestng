package com.credika.test.http.scrm.material

import com.credika.biz.request.http.scrm.material.GroupUpdate
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/18-10:57
 */
class GroupUpdateTest extends BaseTest {
    GroupUpdate group = new GroupUpdate()

    @Test(description = "编辑素材分组", groups = ["prod", "uat"], testName = "groupupdate",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        group.invoke(testContext).baseAssert(testContext)
    }
}
