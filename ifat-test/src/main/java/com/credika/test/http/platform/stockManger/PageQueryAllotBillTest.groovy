package com.credika.test.http.platform.stockManger
import com.credika.biz.request.http.platform.stockManger.PageQueryAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageQueryAllotBillTest extends BaseTest {
    PageQueryAllotBill pageQueryAllotBill = new PageQueryAllotBill()
    @Test(description = "查询调拨单 pageQueryAllotBill" ,groups = ["prod","uat"],testName = "pageQueryAllotBill",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageQueryAllotBill(TestContext testContext){
        pageQueryAllotBill.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
