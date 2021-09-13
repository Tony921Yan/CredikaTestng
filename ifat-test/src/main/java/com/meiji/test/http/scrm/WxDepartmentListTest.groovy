package com.meiji.test.http.scrm

import com.meiji.biz.request.http.scrm.wx.WxDepartmentList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/9/13-10:45
 */
class WxDepartmentListTest extends BaseTest {
    WxDepartmentList wxDepartmentList = new WxDepartmentList()

    @Test(description = "微信部门列表", groups = ["prod", "uat"], testName = "WxDepartmentList",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void test(TestContext testContext) {
        wxDepartmentList.invoke(testContext).baseAssert(testContext)
    }
}
