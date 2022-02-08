package com.meiji.biz.request.http.platform.goods
import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

class CompareDownload extends PlatformGet{
    {
        super.api = "/PriceCompareinfo/compareDownload"
        super.params = ["batchNo"]
    }

    CompareDownload invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CompareDownload preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CompareDownload baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
