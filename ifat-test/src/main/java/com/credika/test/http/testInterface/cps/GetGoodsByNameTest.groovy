package com.credika.test.http.testInterface.cps

import com.credika.biz.request.http.testInterface.cps.GetGoodsByName
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsByNameTest extends BaseTest {
    GetGoodsByName getGoodsByName = new GetGoodsByName()
    @Test(description = "通过关键字查询商品 getGoodsByName" ,groups = ["prod","uat"],testName = "getGoodsByName",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsByName(TestContext testContext){
        testContext.put("page",2)
        testContext.put("rows",10)
        testContext.put("searchText",'儿童牙膏')
        //testContext.put("comprehensiveSort",'desc')
//        testContext.put("priceSort",'asc')
//        testContext.put("commissionMoneySort",'desc')

        getGoodsByName.invoke(testContext).baseAssert(testContext)
    }
}
