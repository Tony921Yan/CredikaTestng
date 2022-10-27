package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetLabelTree extends PlatformPost{
    {
        super.api = "GiftManage/getLabelTree"
        super.params = []
    }

    GetLabelTree invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetLabelTree preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetLabelTree baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetLabelTree afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
         if(apiResult == null){
            println("暂无标签数据！")
             throw new SkipException("暂无标签数据！")
        }
        ArrayList<Map> apiResultList= testContext.getResponse().data
        println(apiResultList.get(0).getAt("parentName"))
        testContext.put("parentName",apiResultList.get(0).getAt("parentName"))
        testContext.put("id",apiResultList.get(0).getAt("id"))
        testContext.put("name",apiResultList.get(0).getAt("name"))
        testContext.put("sort",apiResultList.get(0).getAt("sort"))
        testContext.put("status",apiResultList.get(0).getAt("status"))
        testContext.put("parentId",apiResultList.get(0).getAt("parentId"))
        return this
    }



}
