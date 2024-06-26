package com.credika.biz.request.http.mall.activeRecord

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class RaffleDraw extends MallPost{
    {
        super.api = "activeRecord/raffleDraw"
       super.params = ["activityId","expiryEnd","raffleDeadlineOffset","raffleGoodsLimit","userTypeLimit","raffleTimesLimit",
                        "nickName","orderCode","phone","receiveCouponShopId","receiveCouponShopName","userAvatar","userId"]
    }

    RaffleDraw invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    RaffleDraw preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    RaffleDraw baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }


}
