package com.credika.test.http.platform.hfjy.transporter
import com.credika.biz.request.http.platform.hfjy.transporter.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
    List list = new List()
    @Test(description = "运输服务商管理列表 list" ,groups = ["prod","uat"],testName = "list",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
        testContext.put("condition","{}")
        testContext.put("page",1)
        testContext.put("rows",20)
//        list.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        list.invoke(testContext).baseAssert(testContext)
    }
}