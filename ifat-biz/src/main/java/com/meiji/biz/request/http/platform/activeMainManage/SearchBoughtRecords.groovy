package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchBoughtRecords extends PlatformPost{
    {
        super.api = "ActiveMainManage/searchBoughtRecords"
       super.params = ["page","rows","activityId","beginTime","endTime","orderCode","skuCode","userId","userNickname","userPhoneNumber"]
    }

    SearchBoughtRecords invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchBoughtRecords preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchBoughtRecords baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
