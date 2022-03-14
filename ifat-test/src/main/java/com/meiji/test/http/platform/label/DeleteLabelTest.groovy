package com.meiji.test.http.platform.label

import com.meiji.biz.request.http.platform.label.DeleteLabel
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteLabelTest extends BaseTest {
    DeleteLabel deleteLabel = new DeleteLabel()
    @Test(description = "删除商品标签 deleteLabel" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteLabel(TestContext testContext){
        testContext.get("id", MysqlService.deleteLabel1().get("id"))
        deleteLabel.invoke(testContext).baseAssert(testContext)
    }
}
