package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class Detail extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "activeMainManage/detail"
       super.params = ["id"]
    }

    Detail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Detail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Detail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    Detail afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult == null){
            println("暂无秒杀活动数据")
            throw new SkipException("暂无秒杀活动数据")
        }
        println(apiResult.activeRule)
        println(apiResult.copyWrite)
        println(apiResult.title)
        testContext.put("type",apiResult.type as String)
        testContext.put("name",apiResult.name as String)
        testContext.put("title",apiResult.title)
        testContext.put("remark",apiResult.remark)
        testContext.put("qrCode",apiResult.qrCode)
        testContext.put("posterPic",apiResult.posterPic as String)
        testContext.put("copyWrite",apiResult.copyWrite as String)
        testContext.put("activeRule",apiResult.activeRule as String)
        testContext.put("groupQrcodeUrl",apiResult.groupQrcodeUrl)
        testContext.put("expiryStart",apiResult.expiryStart as String)
        testContext.put("expiryEnd",apiResult.expiryEnd as String)
        testContext.put("preTime",apiResult.preTime as String)
        testContext.put("status",apiResult.status as String)
        testContext.put("secKillActivity",apiResult.secKillActivity as String)
        testContext.put("id",apiResult.id as String)
        return this
    }


}
