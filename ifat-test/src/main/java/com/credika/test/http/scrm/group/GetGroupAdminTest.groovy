package com.credika.test.http.scrm.group;

import com.credika.biz.request.http.scrm.group.GetGroupAdmin;
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test;

/**
 * @author s1mple
 * @create 2021/8/23-17:27
 */
public class GetGroupAdminTest extends BaseTest {
    GetGroupAdmin getGroupAdmin = new GetGroupAdmin();

    @Test(description = "获取群主列表", groups = ["prod", "uat"], testName = "getadmingroup",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        getGroupAdmin.invoke(testContext).baseAssert(testContext)
    }
}
