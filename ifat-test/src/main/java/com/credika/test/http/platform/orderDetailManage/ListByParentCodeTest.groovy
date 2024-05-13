package com.credika.test.http.platform.orderDetailManage

import com.credika.biz.request.http.platform.orderDetailManage.ListByParentCode
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListByParentCodeTest extends BaseTest {
    ListByParentCode listByParentCode = new ListByParentCode()
    @Test(description = "根据母单号获取子单 listByParentCode" ,groups = ["prod","uat"],testName = "listByParentCode-p",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listByParentCode(TestContext testContext){
        listByParentCode.invoke(testContext).baseAssert(testContext)
    }
}
