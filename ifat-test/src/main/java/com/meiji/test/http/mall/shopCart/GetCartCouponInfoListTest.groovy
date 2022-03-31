package com.meiji.test.http.mall.shopCart


import com.meiji.biz.request.http.mall.shopCart.GetCartCouponInfoList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/01/14 19:12
 * @Vession V2.4
 */
class GetCartCouponInfoListTest extends BaseTest{
    GetCartCouponInfoList getCartCouponInfoList = new GetCartCouponInfoList()
    @Test(description = "购物车优惠券查询 getCartCouponInfoList",groups = ["prod","uat"],testName = "getCartCouponInfoList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCartCouponInfoList(TestContext testContext){
        getCartCouponInfoList.invoke(testContext).baseAssert(testContext)
    }
}
