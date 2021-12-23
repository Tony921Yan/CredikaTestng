package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class GetGiftInfo extends MallPost {
    {
        super.api = "/gift/getGiftInfo"
        super.params =  ["giftId","userId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetGiftInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGiftInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

//    GetGiftInfo specialAssert(TestContext testContext){
//        Map apiResult = testContext.getResponse().data
//        Map mysqlResult = MysqlService.GetGiftInfo()
//        System.out.println("apiResult"+ apiResult)
//        System.out.println("mysqlResult"+ mysqlResult)
//        System.out.println("apiResult"+ testContext.getResponse().data.giftGoods.get(0).picUrl)
//        System.out.println("apiResult"+ testContext.getResponse().data.giftGoods.get(0).getAt("picUrl"))
//        assert mysqlResult.pic_url == apiResult.giftGoods.get(0).getAt("picUrl")
//        assert mysqlResult.sku_id == apiResult.giftGoods.get(0).getAt("skuId")
//       return this
//    }
}
