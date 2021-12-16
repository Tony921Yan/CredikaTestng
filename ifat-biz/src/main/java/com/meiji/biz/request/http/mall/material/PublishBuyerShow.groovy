package com.meiji.biz.request.http.mall.material

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class PublishBuyerShow extends MallPost {
    {
        super.api = "orderExhibit/publishBuyerShow"
        super.params =  ["goodsId","orderCode","postFrom","spuId","content","resources","userAvatar","userId","userNickname",
                        "userPhone","cover"]
    }

    PublishBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PublishBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PublishBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
