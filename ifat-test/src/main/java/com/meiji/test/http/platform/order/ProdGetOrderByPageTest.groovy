package com.meiji.test.http.platform.order

import com.meiji.biz.request.http.platform.order.ProdGetOrderByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ProdGetOrderByPageTest extends BaseTest {
    ProdGetOrderByPage prodGetOrderByPage = new ProdGetOrderByPage()
    @Test(description = "获取订单数据 prodGetOrderByPage" ,groups = ["prod","uat"],testName = "prodGetOrderByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void prodGetOrderByPage(TestContext testContext){
        prodGetOrderByPage.invoke(testContext).baseAssert(testContext)
        List<Map> getorder1 = testContext.getResponse().getAt("data").getAt("dataList")
        System.out.println("testing:" + getorder1);
        prodGetOrderByPage.specialAssert(testContext)
    }

}
