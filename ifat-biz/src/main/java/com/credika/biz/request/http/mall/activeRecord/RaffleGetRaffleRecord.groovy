package com.credika.biz.request.http.mall.activeRecord

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class RaffleGetRaffleRecord extends MallPost{
    {
        super.api = "activeRecord/raffleGetRaffleRecord"
       super.params = []
    }

    RaffleGetRaffleRecord invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    RaffleGetRaffleRecord preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    RaffleGetRaffleRecord baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
