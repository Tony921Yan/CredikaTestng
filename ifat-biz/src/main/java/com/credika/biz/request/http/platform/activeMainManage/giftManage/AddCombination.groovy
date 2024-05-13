package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class AddCombination extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftManage/addCombination"
        super.params = ["name","status","categoryIdList","skuList","remark"]
    }
    AddCombination invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddCombination preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddCombination baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}
