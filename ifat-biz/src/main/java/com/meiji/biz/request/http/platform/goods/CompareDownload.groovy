package com.meiji.biz.request.http.platform.goods
import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.HttpUtil
import org.apache.http.HttpResponse;
class CompareDownload extends PlatformGet{
    {
        super.api = "/PriceCompareinfo/compareDownload"
        super.params = ["batchNo"]
    }

    CompareDownload invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    CompareDownload baseAssert(TestContext testContext){
        def result = HttpUtil.post("",)
    }
}
