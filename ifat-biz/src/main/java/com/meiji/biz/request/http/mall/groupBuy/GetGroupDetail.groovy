package com.meiji.biz.request.http.mall.groupBuy
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupDetail extends MallPost{
    {
        super.api = "active/getGroupDetail"
       super.params = ["activityId","groupId"]
    }

    GetGroupDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupDetail baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
