package com.meiji.test.http.shop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.shop.FindGoodsDetail
import org.testng.annotations.Test

class FindGoodsDetailTest extends BaseTest {
    FindGoodsDetail findGoodsDetail = new FindGoodsDetail()
    @Test(description = "查询商品详情 findGoodsDetail" ,groups = ["prod","uat"],testName = "findGoodsDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsDetail(TestContext testContext){
        findGoodsDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
