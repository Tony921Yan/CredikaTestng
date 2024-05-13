package com.credika.test.http.platform.stockManger
import com.credika.biz.request.http.platform.stockManger.CreateAllotBill
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CreateAllotBillTest extends BaseTest {
    CreateAllotBill createAllotBill = new CreateAllotBill()
    @Test(description = "创建调拨单-划出 createAllotBill1" ,groups = ["prod","uat"],testName = "createAllotBill1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void createAllotBill1(TestContext testContext){
        createAllotBill.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "创建调拨单-归还 createAllotBill2",groups = ["prod","uat"],testName = "createAllotBill2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void  createAllotBill2(TestContext testContext ){
        createAllotBill.invoke(testContext).baseAssert(testContext)
    }
}
