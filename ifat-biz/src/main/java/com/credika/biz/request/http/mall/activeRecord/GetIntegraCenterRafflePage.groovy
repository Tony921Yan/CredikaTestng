package com.credika.biz.request.http.mall.activeRecord

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetIntegraCenterRafflePage extends MallPost{
    {
        super.api = "integral/getIntegraCenterRafflePage"
        super.params = []
    }

    GetIntegraCenterRafflePage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetIntegraCenterRafflePage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetIntegraCenterRafflePage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetIntegraCenterRafflePage afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult==null){
            println("暂无积分抽奖活动")
            throw new SkipException("暂无积分抽奖活动")
        }
        testContext.put("actId",apiResult.activityId)

    }


}
