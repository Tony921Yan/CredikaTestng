package com.credika.test.http.platform.contentManage

import com.credika.biz.request.http.platform.contentManage.ContentManageAdd
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ContentManageAddtest extends BaseTest {


    ContentManageAdd contentManageAdd = new ContentManageAdd()
    @Test(description = "商品管理-内容管理 contentManageAdd" ,groups = ["prod","uat"],testName = "contentManageAdd",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void contentManageAdd(TestContext testContext){
        contentManageAdd.invoke(testContext).baseAssert(testContext)
    }
}
