package com.meiji.biz.request.http.platform.orderDetailManage


import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ListByParentCode extends PlatformPost {
    {
        super.api = "OrderDetailManage/listByParentCode"
        super.params =  ["parentCode"]
    }

    ListByParentCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListByParentCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListByParentCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
