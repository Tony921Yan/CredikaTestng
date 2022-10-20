package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import org.junit.Test

import java.text.SimpleDateFormat

class GetGoodsRoomLive extends MallPost {
    {
        super.api = "shopGoods/getGoodsRoomLive"
        super.params =  ["goodsId"]
    }

    GetGoodsRoomLive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsRoomLive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsRoomLive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGoodsRoomLive specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.getLiveRoom(testContext.get("goodsId"))
        if(apiResult || mysqlResult != null){
            assert apiResult.get("coverImgUrl") == mysqlResult.get("cover_img_url")
            assert apiResult.get("goodsId") == mysqlResult.get("goods_id")
            assert apiResult.get("pushAddr") == mysqlResult.get("push_addr")
            assert apiResult.get("goodsName") == mysqlResult.get("goods_name")
            assert apiResult.get("roomId") == mysqlResult.get("room_id")
            assert apiResult.get("liveStatus") == mysqlResult.get("live_status")
            assert apiResult.get("startTime") == new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get("start_time"))
            assert apiResult.get("endTime") == new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get("end_time"))
        }
        return this
    }
}
