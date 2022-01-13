package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy* @date 2022/01/06 22:05
 * @Vession V2.4
 */
class PublishWithoutOrder extends MallPost{
    {
        super.api = "orderExhibit/publishWithoutOrder"
        super.params = ["content","cover","goodsInfo","resources","shopId","spuId","userAvatar","userId","userNickname","userPhone"]
    }

    PublishWithoutOrder invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PublishWithoutOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PublishWithoutOrder afterInvoke(TestContext testContext){
        testContext.put("id",testContext.getResponse().data.showId)
        return this
    }
}
