package com.credika.test.http.mall.shopCart

import com.credika.biz.request.http.mall.shopCart.AddCartItem
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/14 19:12
 * @Vession V2.4
 */
class AddCartItemTest extends BaseTest{
    AddCartItem addCartItem = new AddCartItem()
    @Test(description = "晒单广场-购物车-加购 addCartItem",groups = ["prod","uat"],testName = "addCartItem",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addCartItem(TestContext testContext){
        addCartItem.invoke(testContext).baseAssert(testContext)
    }
}
