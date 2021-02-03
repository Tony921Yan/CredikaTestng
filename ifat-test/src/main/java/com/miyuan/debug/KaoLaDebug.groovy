package com.miyuan.debug

import com.alibaba.fastjson.JSON
import com.miyuan.api.KaoLaAPI
import com.miyuan.channel.request.kaola.QueryGoodsInfoRequest
import com.miyuan.channel.request.kaola.QueryShareLinkRequest
import org.junit.Test

class KaoLaDebug {
    @Test
    void test(){
        QueryShareLinkRequest queryShareLinkRequest = new QueryShareLinkRequest()
        List list = new ArrayList()
        list.add("https://weex.kaola.com/activity/pages/d3eb49a400784891842f4d39b05d7726.html")
        queryShareLinkRequest.linkList = JSON.toJSONString(list)
        queryShareLinkRequest.trackingCode1="111111"
        println(KaoLaAPI.queryShareLink(queryShareLinkRequest))
    }

    @Test
    void test2(){
        QueryGoodsInfoRequest queryGoodsInfoRequest = new QueryGoodsInfoRequest()
        queryGoodsInfoRequest.goodsIds="5885952"
        println(KaoLaAPI.queryGoodsInfo(queryGoodsInfoRequest))
    }
}
