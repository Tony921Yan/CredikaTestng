package com.meiji.biz.request.http.platform.memeberDayConfig
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException
class MemberDayConfigQuery extends PlatformPost{
    {
        super.api="/MemeberDayConfig/memberDayConfigQuery"
        super.params = []
    }

    MemberDayConfigQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberDayConfigQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberDayConfigQuery afterInvoke(TestContext testContext){
        def apiResult =testContext.getResponse().data
           if(apiResult.size()==0){
            throw new SkipException("会员日配置为空")
//            println("会员日配置为空")
        }
        testContext.put("virtualSubscriberCount",apiResult.virtualSubscriberCount)
        testContext.put("defaultPic",apiResult.defaultPic)
        testContext.put("beginTime",apiResult.beginTime)
        testContext.put("endTime",apiResult.endTime)
        testContext.put("integralMultiplier",apiResult.integralMultiplier)
        testContext.put("rightsDisplayPic",apiResult.rightsDisplayPic)
        testContext.put("enabled",apiResult.enabled)
        testContext.put("goodsDetailPic",apiResult.goodsDetailPic)
        testContext.put("activeHeadPic",apiResult.activeHeadPic)
        testContext.put("repeatDate",DateUtil.strToDate(apiResult.repeatDate as String))
        return this
    }

    MemberDayConfigQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}