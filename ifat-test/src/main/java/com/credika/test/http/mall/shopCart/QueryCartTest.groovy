package com.credika.test.http.mall.shopCart

import com.credika.biz.request.http.mall.shopCart.QueryCart
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class QueryCartTest extends BaseTest {
    QueryCart queryCart = new QueryCart()
    @Test(description = "购物车查询 queryCart" ,groups = ["prod","uat"],testName = "queryCart",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryCart(TestContext testContext){
        queryCart.invoke(testContext).baseAssert(testContext)
    }
}
