package com.meiji.test.http.mall.shopGoods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.mall.shopGoods.FindShopGoodsDetail
import org.testng.annotations.Test

class FindShopGoodsDetailTest extends BaseTest {
    FindShopGoodsDetail findShopGoodsDetail = new FindShopGoodsDetail()
    @Test(description = "查询店铺商品详情 findShopGoodsDetail" ,groups = ["prod","uat"],testName = "findShopGoodsDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsDetail(TestContext testContext){
        testContext.replace("spuId","1422437862342688")
        findShopGoodsDetail.invoke(testContext).baseAssert(testContext)
//        findShopGoodsDetail.specialAssert(testContext)
    }

    @Test(description = "抽奖活动-打开企业二维码 findShopGoodsDetail1" ,groups = ["uat"],testName = "findShopGoodsDetail1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsDetail1(TestContext testContext) {
        findShopGoodsDetail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "订阅商品—商品详情 findShopGoodsDetail2" ,groups = ["uat"],testName = "findShopGoodsDetail2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopGoodsDetail2(TestContext testContext) {
        findShopGoodsDetail.invoke(testContext).baseAssert(testContext)
    }
}
