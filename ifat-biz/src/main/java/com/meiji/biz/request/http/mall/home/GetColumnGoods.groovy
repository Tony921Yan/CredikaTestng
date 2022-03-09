package com.meiji.biz.request.http.mall.home

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import java.util.stream.Collectors

/**
 * @author Remy*
 * @date 2022/03/09 18:32
 * @Vession V2.5
 */
class GetColumnGoods extends MallPost{
    {
        super.api = "home/getColumnGoods"
        super.params=["shopId","columnId"]
    }

    GetColumnGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetColumnGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    static List getSkuIds(TestContext testContext){
        List<Map> goodDataList = testContext.getResponse().get("data")
        List<Map> skuIds =goodDataList.stream().map { x -> return x."skuId" }.collect(Collectors.toList())
        return skuIds
    }

}
