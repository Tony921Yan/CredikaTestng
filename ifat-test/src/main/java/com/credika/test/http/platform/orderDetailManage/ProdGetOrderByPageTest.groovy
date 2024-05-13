package com.credika.test.http.platform.orderDetailManage

import com.credika.biz.request.http.platform.orderDetailManage.GetOrderByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdGetOrerByPageTest extends BaseTest {
    GetOrderByPage getOrderByPage = new GetOrderByPage()
    @Test(description = "获取订单数据 getOrderByPage" ,groups = ["prod","uat"],testName = "getOrderByPage-all",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderByPage(TestContext testContext){
        getOrderByPage.invoke(testContext).baseAssert(testContext)
        List<Map> getorder1 = testContext.getResponse().getAt("data").getAt("dataList")
        System.out.println("testing:" + getorder1);
        getOrderByPage.specialAssert(testContext)
    }

}
