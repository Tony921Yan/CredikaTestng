package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/05 22:48
 * @Vession V2.5
 */
class SaveBuyerShow extends MallPost{
    {
        super.api = "orderExhibit/saveBuyerShow"
        super.params = ["goodsId","orderCode","postFrom","spuId","content","resources","userAvatar","userId",
                        "userNickname","userPhone","cover"]
    }

    SaveBuyerShow invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    SaveBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
