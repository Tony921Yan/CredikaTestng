package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class SearchBuyerShow extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/searchBuyerShow"
        super.params =  ["page","rows","columnId","contentSource"]
    }

    SearchBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    SearchBuyerShow afterInvoke(TestContext testContext){
       def apiResult = testContext.getResponse().data.dataList
        if(apiResult==[]){
            throw new SkipException("暂无晒单(溯源)数据")
            return null
        }
        testContext.put("businessType",apiResult.get(0).get("businessType"))
        testContext.put("pics",apiResult.get(0).get("pics"))
        testContext.put("cover",apiResult.get(0).get("cover"))
        testContext.put("id",apiResult.get(0).get("id"))
        testContext.put("text",apiResult.get(0).get("text"))
        testContext.put("title",apiResult.get(0).get("title"))
        testContext.put("isOfficial",apiResult.get(0).get("isOfficial"))
        return this
    }

}
