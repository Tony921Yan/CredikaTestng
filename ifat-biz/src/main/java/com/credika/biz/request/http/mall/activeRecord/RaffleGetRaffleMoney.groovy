package com.credika.biz.request.http.mall.activeRecord

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/23 23:18
 * @Vession V2.6.3
 * */
class RaffleGetRaffleMoney extends MallPost{
    {
        super.api = "activeRecord/raffleDraw"
       super.params = ["recordId"]
    }

    RaffleGetRaffleMoney invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    RaffleGetRaffleMoney preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    RaffleGetRaffleMoney baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }


}
