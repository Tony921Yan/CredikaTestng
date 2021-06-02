package com.meiji.test.http.platform.label

import com.meiji.biz.request.http.platform.label.DeleteLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteLabelTest extends BaseTest { //此接口不通，原因待查，swagger/postman是通的
    DeleteLabel deleteLabel = new DeleteLabel()
    @Test(description = "删除商品标签 deleteLabel" ,groups = ["prod","uat"],testName = "deleteLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteLabel(TestContext testContext){
        deleteLabel.invoke(testContext).baseAssert(testContext)
    }
}
