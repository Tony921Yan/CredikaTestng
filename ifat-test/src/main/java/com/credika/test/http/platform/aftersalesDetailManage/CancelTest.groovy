package com.credika.test.http.platform.aftersalesDetailManage

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.platform.aftersalesDetailManage.Cancel
import org.testng.annotations.Test

class CancelTest extends BaseTest {
    Cancel cancel = new Cancel() //表order_after 首先after_status为1，执行后变为7
    @Test(description = "取消售后单-异常场景-不可取消时抛异常 cancel" ,groups = ["prod","uat"],testName = "cancel-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cancel(TestContext testContext){
        cancel.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
