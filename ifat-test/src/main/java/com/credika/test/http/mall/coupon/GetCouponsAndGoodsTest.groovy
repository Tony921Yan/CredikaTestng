package com.credika.test.http.mall.coupon

import com.credika.biz.request.http.mall.coupon.GetCouponsAndGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetCouponsAndGoodsTest extends BaseTest {
    GetCouponsAndGoods getCouponsAndGoods = new GetCouponsAndGoods()
    @Test(description = "查询活动券包信息 getCouponsAndGoods" ,groups = ["prod","uat"],testName = "getCouponsAndGoods-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCouponsAndGoods(TestContext testContext){
        getCouponsAndGoods.invoke(testContext).baseAssert(testContext)
    }
}