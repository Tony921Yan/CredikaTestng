package com.credika.test.http.platform.goodsDetailMange


import com.credika.biz.request.http.platform.goodsDetailManage.GetGoodsCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsCountTest extends BaseTest {
    GetGoodsCount getGoodsCount = new GetGoodsCount()
    @Test(description = "查询各种商品状态的条数-全部 getGoodsCount" ,groups = ["prod","uat"],testName = "getGoodsCount-all",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsCount(TestContext testContext){
        getGoodsCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询各种商品状态的条数-商品名称 getGoodsCount" ,groups = ["prod","uat"],testName = "getGoodsCount-spuName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsCount1(TestContext testContext){
        getGoodsCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询各种商品状态的条数-商品类型 getGoodsCount" ,groups = ["prod","uat"],testName = "getGoodsCount-goodsType",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsCount2(TestContext testContext){
        getGoodsCount.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询各种商品状态的条数-随机组合 getGoodsCount" ,groups = ["prod","uat"],testName = "getGoodsCount-3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsCount3(TestContext testContext){
        getGoodsCount.invoke(testContext).baseAssert(testContext)
    }


}
