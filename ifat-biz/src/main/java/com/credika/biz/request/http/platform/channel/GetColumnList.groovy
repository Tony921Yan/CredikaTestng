package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetColumnList extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ColumnManagement/getColumnList"
        super.params =  ["channelId"]
    }

    GetColumnList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetColumnList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetColumnList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
