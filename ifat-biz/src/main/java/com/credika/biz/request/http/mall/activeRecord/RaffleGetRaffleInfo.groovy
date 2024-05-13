package com.credika.biz.request.http.mall.activeRecord

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class RaffleGetRaffleInfo extends MallPost{
    {
        super.api = "activeRecord/raffleGetRaffleInfo"
       super.params = []
    }

    RaffleGetRaffleInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    RaffleGetRaffleInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    RaffleGetRaffleInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
