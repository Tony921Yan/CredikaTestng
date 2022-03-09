package com.meiji.test.http.mall.home

import com.meiji.biz.request.http.mall.home.GetColumnGoods
import com.meiji.biz.request.http.testInterface.cps.GetSpecialAreaGoods
import com.meiji.biz.request.http.testInterface.cps.SearchCpsCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ColunmnGoodsListToMiyuanTest extends BaseTest {
    SearchCpsCategory searchCpsCategory = new SearchCpsCategory()
    GetColumnGoods getColumnGoods = new GetColumnGoods() //node层修改接口地址：searchGoodsList
    GetSpecialAreaGoods getSpecialAreaGoods= new GetSpecialAreaGoods()
    @Test(description = "查询美记首页推荐类目列表" ,groups = ["prod","uat"],testName = "蜜源首頁美记推荐类目",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void GetolumunGoodsList(TestContext testContext){
        //获取美记首页推荐类目商品
        searchCpsCategory.invoke(testContext)
        List cpsCategoryIds =searchCpsCategory.getCpsCategoryIds(testContext)
        if(cpsCategoryIds.size()>1){
            for(int i=1;i<cpsCategoryIds.size();i++){
                String cpsCategoryId=cpsCategoryIds.get(i).toString()
                println("主推id："+cpsCategoryId)
                testContext.put("columnId",cpsCategoryId)
                testContext.put("cpsCategoryId",cpsCategoryId)
                getColumnGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
                List ColumnGoodIds =getColumnGoods.getSkuIds(testContext)
                getSpecialAreaGoods.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
                List SpecialAreaGoodIds =getSpecialAreaGoods.getCpsSkuIds(testContext)
                assert ColumnGoodIds==SpecialAreaGoodIds
            }

        }


    }
}
