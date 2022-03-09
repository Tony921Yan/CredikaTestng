package com.meiji.biz.request.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy
 * * @date 2022/02/08 9:36
 * @Vession V2.5
 */
class PublishBuyerShowAndDeleteBuyeShow extends MallPost{
    {
        super.api = "orderExhibit/publishBuyerShow"
        super.params = ["goodsId","orderCode","postFrom","spuId","content","resources",
                        "userAvatar","userId","userNickname","userPhone","orderId","cover"]
    }

    PublishBuyerShowAndDeleteBuyeShow invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PublishBuyerShowAndDeleteBuyeShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
