package com.meiji.test.http.orderafter

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.orderafter.Cancel
import org.testng.annotations.Test

class CancelTest extends BaseTest {
    Cancel cancel = new Cancel() //表order_after 首先after_status为1，执行后变为7
    @Test(description = "取消售后单 cancel" ,groups = ["prod","uat"],testName = "cancel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancel(TestContext testContext){
        cancel.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
