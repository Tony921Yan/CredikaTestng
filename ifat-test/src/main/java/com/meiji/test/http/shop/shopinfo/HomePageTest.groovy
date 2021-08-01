package com.meiji.test.http.shop.shopinfo

import com.meiji.biz.request.http.shop.shopinfo.HomePage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage()
    @Test(description = "店铺数据统计-首页接口(订单数据统计，商品数据统计，销售数据统计) homePage" ,groups = ["prod","uat"],testName = "homePage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void homePage(TestContext testContext){
        homePage.invoke(testContext).baseAssert(testContext)
    }
}
