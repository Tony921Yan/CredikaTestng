package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchActivityRecords extends PlatformPost{
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
