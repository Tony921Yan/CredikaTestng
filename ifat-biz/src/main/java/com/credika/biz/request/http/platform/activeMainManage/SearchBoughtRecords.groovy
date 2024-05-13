package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class SearchBoughtRecords extends com.credika.biz.request.http.platform.PlatformPost{
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
