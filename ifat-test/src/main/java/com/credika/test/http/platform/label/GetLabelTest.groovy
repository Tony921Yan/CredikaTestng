package com.credika.test.http.platform.label

import com.credika.biz.request.http.platform.label.GetLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetLabelTest extends BaseTest {
    GetLabel getLabel = new GetLabel()
    @Test(description = "查询标签列表 getLabel" ,groups = ["prod","uat"],testName = "getLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLabel(TestContext testContext){
        getLabel.invoke(testContext).baseAssert(testContext)
        getLabel.specialAssert(testContext)
    }
}
