package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class SearchActivityRecords extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/searchActivityRecords"
       super.params = ["activityId","activityName","activityType","gmtCreateEnd","gmtCreateStart","groupId","groupStatus",
                       "isInitiator","nickname","orderCode","phoneNumber","page","rows","shopName","skuCode","spuCode","spuName"]
    }

    SearchActivityRecords invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchActivityRecords preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchActivityRecords baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
