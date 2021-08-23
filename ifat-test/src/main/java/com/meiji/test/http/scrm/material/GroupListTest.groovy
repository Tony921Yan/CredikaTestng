package com.meiji.test.http.scrm.material

import com.meiji.biz.request.http.scrm.material.GroupList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-16:48
 */
class GroupListTest extends BaseTest {
    GroupList groupList = new GroupList()

    @Test(description = "素材群组列表", groups = ["prod", "uat"], testName = "materialgrouplist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        groupList.invoke(testContext).baseAssert(testContext)
    }
}
