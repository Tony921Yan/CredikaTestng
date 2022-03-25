package com.meiji.test.http.platform.couponManage

import com.meiji.biz.request.http.platform.couponManage.GetRelationshipByCouponId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetRelationshipByCouponIdTest extends BaseTest {
    GetRelationshipByCouponId getRelationshipByCouponId = new GetRelationshipByCouponId()
    @Test(description = "查询优惠券是否关联活动 getRelationshipByCouponId" ,groups = ["prod","uat"],testName = "getRelationshipByCouponId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getRelationshipByCouponId(TestContext testContext){
        getRelationshipByCouponId.invoke(testContext).baseAssert(testContext)
    }

}