package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMemberDayDiscountZoneData extends MallPost {
    {
        super.api = "active/getMemberDayDiscountZoneData"
        super.params =  ["page","rows","shopId"]
    }

    GetMemberDayDiscountZoneData invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMemberDayDiscountZoneData preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMemberDayDiscountZoneData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
