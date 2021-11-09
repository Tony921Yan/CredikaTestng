package com.meiji.test.http.testInterface.cps

import com.meiji.biz.request.http.testInterface.cps.GetSpecialAreaGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSpecialAreaGoodsTest extends BaseTest {
    GetSpecialAreaGoods getSpecialAreaGoods = new GetSpecialAreaGoods()
    @Test(description = "查询专区商品接口 getSpecialAreaGoods" ,groups = ["prod","uat"],testName = "getSpecialAreaGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSpecialAreaGoods(TestContext testContext){
        testContext.put("categoryType",1)
//        testContext.put("cpsCategoryId",1441958715195424)
        testContext.put("page",1)
        testContext.put("rows",20)
        getSpecialAreaGoods.invoke(testContext).baseAssert(testContext)
    }
}
