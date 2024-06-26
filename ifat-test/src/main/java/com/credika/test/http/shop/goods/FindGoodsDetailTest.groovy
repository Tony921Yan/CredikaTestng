package com.credika.test.http.shop.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.goods.FindGoodsDetail
import org.testng.annotations.Test

class FindGoodsDetailTest extends BaseTest {
    FindGoodsDetail findGoodsDetail = new FindGoodsDetail()
    @Test(description = "查询商品详情 findGoodsDetail" ,groups = ["prod","uat"],testName = "findGoodsDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsDetail(TestContext testContext){
        findGoodsDetail.invoke(testContext).baseAssert(testContext)
    }
}
