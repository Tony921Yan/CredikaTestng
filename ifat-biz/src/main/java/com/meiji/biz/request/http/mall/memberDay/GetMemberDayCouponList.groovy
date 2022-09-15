package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetMemberDayCouponList extends MallPost {
    {
        super.api = "active/getMemberDayCouponList"
        super.params =  ["shopId"]
    }

    GetMemberDayCouponList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMemberDayCouponList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMemberDayCouponList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetMemberDayCouponList afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult==null){
            println("无会员日券包活动")
            throw new SkipException("无会员日券包活动")
        }
        testContext.put("activeId",apiResult.activeId)
        println(apiResult.activeId)
        return this
    }

}
