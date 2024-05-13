package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.mall.shopGoods.FindShopGoodsList
import com.credika.biz.request.http.testInterface.cps.GetSpecialAreaGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSpecialAreaGoodsTest extends BaseTest {
    GetSpecialAreaGoods getSpecialAreaGoods = new GetSpecialAreaGoods()
    FindShopGoodsList findShopGoodsList = new FindShopGoodsList()
    @Test(description = "查询专区商品接口 getSpecialAreaGoods" ,groups = ["prod","uat"],testName = "getSpecialAreaGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSpecialAreaGoods(TestContext testContext){
//        testContext.put("categoryType",3)
       testContext.put("cpsCategoryId","1459386794901536")
        testContext.put("page",1)
        testContext.put("rows",20)
        testContext.put("priceSort","desc")
        getSpecialAreaGoods.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "核对蜜源首页-美记精选商品" ,groups = ["prod","uat"],testName = "蜜源首頁美记精选商品",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMeijiSpecialAreaGoods(TestContext testContext){
       //获取美记内部首页美记精选商品,目前CPS首页要过滤掉测试白名单商品和跨境商品，因此通过数据库查询返回判断，接口不会过滤
        findShopGoodsList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
        List<Map> meJiSkuIdlist = findShopGoodsList.getSkuIds(testContext)
//        List<Map> meJiSkuIdlist = MysqlService.getHomePageGoods

        //获取cps首页美记精选商品
        getSpecialAreaGoods.invoke(testContext).baseAssert(testContext)
        List<Map> cpsSkuIdlist =getSpecialAreaGoods.getCpsSkuIds(testContext)
        assert  meJiSkuIdlist.size()==cpsSkuIdlist.size()
        assert meJiSkuIdlist== cpsSkuIdlist
    }


}
