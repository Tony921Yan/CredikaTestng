package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class CategoryDetail extends PlatformPost{
    {
        super.api = "GiftManage/categoryDetail"
        super.params = ["id"]
    }

    CategoryDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CategoryDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CategoryDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CategoryDetail afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult == null){
            println("暂无分类数据")
            throw new SkipException("暂无分类数据")
        }
        testContext.put("id",apiResult.id)
        testContext.put("name",apiResult.name)
        testContext.put("status",apiResult.status)
        testContext.put("pic",apiResult.pic)
        testContext.put("sort",apiResult.sort)
        testContext.put("remark",apiResult.remark)
        List<Long> labelIds = apiResult.labelList.getAt("id")
        testContext.put("labelIds",labelIds)
//        testContext.put("labelIds",[1508701305307199])
        println(apiResult.goodsList.get(0).getAt("pics"))
        List<Map> goodsList = apiResult.goodsList.get(0).getAt("pics")
        for(int i = 0 ; i< goodsList.size();i++){
            goodsList.get(i).remove("picUrl")
            goodsList.get(i).remove("picId")
        }
        testContext.put("spuIdList",goodsList)
        return this
    }
}
