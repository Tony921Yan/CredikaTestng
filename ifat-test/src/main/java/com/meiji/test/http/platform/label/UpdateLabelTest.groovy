package com.meiji.test.http.platform.label

import com.meiji.biz.request.http.platform.label.AddLabel
import com.meiji.biz.request.http.platform.label.UpdateLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateLabelTest extends BaseTest {
    UpdateLabel updateLabel = new UpdateLabel()
    @Test(description = "更新商品标签 updateLabel" ,groups = ["prod","uat"],testName = "updateLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateLabel(TestContext testContext){
        updateLabel.invoke(testContext).baseAssert(testContext)
    }
}
