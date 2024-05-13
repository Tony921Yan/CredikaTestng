package com.credika.test.http.scrm.group

import com.credika.biz.request.http.scrm.group.GetGroupList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/23-17:32
 */
class GetGroupListTest extends BaseTest {
    GetGroupList groupList = new GetGroupList()

    @Test(description = "获取群列表", groups = ["prod", "uat"], testName = "getgrouplist",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        groupList.invoke(testContext).baseAssert(testContext)
    }
}
