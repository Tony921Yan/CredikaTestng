package com.credika.biz.request.http.mall.groupBuy
import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupTeamByGoods extends MallPost{
    {
        super.api = "active/getGroupTeamByGoods"
       super.params = ["activityId","spuId"]
    }

    GetGroupTeamByGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupTeamByGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupTeamByGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
