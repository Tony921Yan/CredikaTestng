package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.GetOrderGoodsInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/07 10:30
 * @Vession V2.5
 */
class GetOrderGoodsInfoTest extends BaseTest{
    GetOrderGoodsInfo getOrderGoodsInfo = new GetOrderGoodsInfo()
    @Test(description = "订单商品详情-晒单 getOrderGoodsInfo",groups = ["uat","prod"],testName = "getOrderGoodsInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getOrderGoodsInfo(TestContext testContext){
        getOrderGoodsInfo.invoke(testContext).baseAssert(testContext)
    }
}
