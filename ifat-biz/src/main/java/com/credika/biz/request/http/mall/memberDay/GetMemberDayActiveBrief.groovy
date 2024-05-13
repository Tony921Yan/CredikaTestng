package com.credika.biz.request.http.mall.memberDay
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetMemberDayActiveBrief extends MallPost {
    {
        super.api = "active/getMemberDayActiveBrief"
        super.params =  ["shopId"]
    }

    GetMemberDayActiveBrief invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMemberDayActiveBrief preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMemberDayActiveBrief baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetMemberDayActiveBrief afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult.subscribeActiveId==null){
            println("暂无会员日订阅活动")
            throw new SkipException("暂无会员日订阅活动")
        }
        testContext.put("subscribeActiveId",apiResult.subscribeActiveId)
        testContext.put("subscribeBeginTime",apiResult.subscribeBeginTime)
        return this
        }
    }
