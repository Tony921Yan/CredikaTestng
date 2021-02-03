package com.miyuan.request.api.marketing

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest

class CenterGetmarketingList extends MiyuanRequest {
    {
        super.api = "/api/marketing/superred/getAwardCacheList"
        super.params = ["activityId"]
    }


    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }



    MiyuanRequest sumredMoneylAssert(TestContext testContext) {
        List list = testContext.getResponse().data
        BigDecimal dd=0
       list.stream().forEach{
           x->
               dd += new BigDecimal(x.redMoney)
       }
        println("ffff"+dd)
     //   def isTrue = redMoneys.sum()

    }


//


}
