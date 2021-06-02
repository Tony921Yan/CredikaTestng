package com.meiji.test.http.platform.label

import com.meiji.biz.request.http.platform.label.AddLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddLabelTest extends BaseTest {
    AddLabel addLabel = new AddLabel()
    @Test(description = "新增商品标签 addLabel" ,groups = ["prod","uat"],testName = "addLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addLabel(TestContext testContext){
        addLabel.invoke(testContext).baseAssert(testContext)
    }
}
