package com.credika.biz.request.http.platform.asyncManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderAsyncExportTaskByPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "AsyncManage/getOrderAsyncExportTaskByPage"       //接口地址
        super.params = ["condition","page","rows"]    //接口参数
    }

    GetOrderAsyncExportTaskByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAsyncExportTaskByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAsyncExportTaskByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
