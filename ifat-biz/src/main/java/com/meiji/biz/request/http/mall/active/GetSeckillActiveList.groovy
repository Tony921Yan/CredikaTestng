package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

/**
 * @author Remy*
 * @date 2022/04/20 9:24
 * @Vession v2.7.1
 * */
class GetSeckillActiveList extends MallPost{
    {
        super.api = "active/getSeckillActiveList"
        super.params = []
    }

    GetSeckillActiveList afterinvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult.data.size()==0){
            throw new SkipException("无可用的秒杀活动")
        }
        testContext.put("activeMainId",apiResult.data.getAt[0].getAt("activeMainId"))
        testContext.put("sessionCode",apiResult.data.getAt[0].getAt("sessionCode"))
        testContext.put("subTimeId",apiResult.data.getAt[0].getAt("subTimeId"))
        return this
    }

    GetSeckillActiveList invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSeckillActiveList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
