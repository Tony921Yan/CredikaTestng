package com.credika.test.http.platform.aftersalesDetailManage

import com.credika.biz.request.http.platform.aftersalesDetailManage.UpdateAfterRemark
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateAfterRemarkTest extends BaseTest {
    UpdateAfterRemark updateAfterRemark = new UpdateAfterRemark()
    @Test(description = "修改售后备注 updateAfterRemark" ,groups = ["prod","uat"],testName = "updateAfterRemark-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateAfterRemark(TestContext testContext){
        updateAfterRemark.invoke(testContext).baseAssert(testContext)
    }
}
