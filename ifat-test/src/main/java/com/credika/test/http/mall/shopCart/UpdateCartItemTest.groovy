package com.credika.test.http.mall.shopCart

import com.credika.biz.request.http.mall.shopCart.UpdateCartItem
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/14 19:56
 * @Vession V2.4
 */
class UpdateCartItemTest extends BaseTest{
    UpdateCartItem updateCartItem = new UpdateCartItem()
    @Test(description = "购物车-更新商品数量 updateCartItem",groups = ["prod","uat"],testName = "updateCartItem",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateCartItem(TestContext testContext){
        updateCartItem.invoke(testContext).baseAssert(testContext)
    }
}
