package com.meiji.test.http.platform.label

import com.meiji.biz.request.http.platform.label.PageLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageLabelTest extends BaseTest {
    PageLabel pageLabel = new PageLabel()
    @Test(description = "查询标签列表 pageLabel" ,groups = ["prod","uat"],testName = "pageLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageLabel(TestContext testContext){
        pageLabel.invoke(testContext).baseAssert(testContext)
    }
}
