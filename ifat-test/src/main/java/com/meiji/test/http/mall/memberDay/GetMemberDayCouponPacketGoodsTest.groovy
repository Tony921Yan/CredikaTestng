package com.meiji.test.http.mall.memberDay
import com.meiji.biz.request.http.mall.memberDay.GetMemberDayCouponPacketGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMemberDayCouponPacketGoodsTest extends BaseTest {
    GetMemberDayCouponPacketGoods getMemberDayCouponPacketGoods = new GetMemberDayCouponPacketGoods()
    @Test(description = "获取会员日券包商品分页数据 getMemberDayCouponPacketGoods" ,groups = ["prod","uat"],testName = "getMemberDayCouponPacketGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMemberDayCouponPacketGoods(TestContext testContext){
        getMemberDayCouponPacketGoods.invoke(testContext).baseAssert(testContext)
    }
}
