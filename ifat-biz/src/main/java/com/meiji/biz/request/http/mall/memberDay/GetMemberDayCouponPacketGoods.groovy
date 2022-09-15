package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMemberDayCouponPacketGoods extends MallPost {
    {
        super.api = "active/getMemberDayCouponPacketGoods"
        super.params =  ["page","rows","shopId"]
    }

    GetMemberDayCouponPacketGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMemberDayCouponPacketGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMemberDayCouponPacketGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
