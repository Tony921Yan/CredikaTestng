package com.credika.test.http.platform.goodsDetailMange
import com.credika.biz.request.http.platform.goodsDetailManage.ShowSales
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ShowSalesTest extends BaseTest {
    ShowSales sales = new ShowSales()
    @Test(description = "配置管理-是否开启基础销量 sales" ,groups = ["prod","uat"],testName = "sales",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void sales(TestContext testContext){
        sales.invoke(testContext).baseAssert(testContext)
    }
}
