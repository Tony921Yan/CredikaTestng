package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.GetAllOneCategorys
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetAllOneCategorysTest extends BaseTest {
    GetAllOneCategorys getAllOneCategorys = new GetAllOneCategorys()
    @Test(description = "查询店铺所有一级类目 getAllOneCategorys" ,groups = ["prod","uat"],testName = "getAllOneCategorys",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAllOneCategorys(TestContext testContext){
        //testContext.put()
        getAllOneCategorys.invoke(testContext).baseAssert(testContext)
    }
}
