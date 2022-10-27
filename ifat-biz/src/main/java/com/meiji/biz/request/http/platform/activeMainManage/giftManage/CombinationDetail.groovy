package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class CombinationDetail extends PlatformPost{
    {
        super.api = "GiftManage/combinationDetail"
        super.params = ["id"]
    }

    CombinationDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CombinationDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CombinationDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CombinationDetail afterInvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult == null){
            println("暂无组合礼品数据！")
            throw new SkipException("暂无组合礼品数据！")
        }
        testContext.put("id",apiResult.id)
        testContext.put("name",apiResult.name)
        testContext.put("status",apiResult.status)
        testContext.put("remark",apiResult.remark)
        List list= apiResult.goodsList
        println("list" + apiResult.goodsList.getAt("skus").getAt("giftGroupNum"))
        List skuList =apiResult.goodsList.getAt("skus")
        println(skuList.getAt("giftGroupNum"))
        skuList.remove("skuCode")
        testContext.put("skuNum",skuList.getAt("giftGroupNum"))
        testContext.put("sort",skuList.getAt("giftGroupSort"))




//        ArrayList list = new ArrayList()
//        ArrayList<Map> categoryList = apiResult.categoryList
//        for(int i =0;i<=categoryList.size();i++){
//            categoryList.get(i).remove("name")
//            categoryList.get(i).get("id")
////            println("categoryList" + categoryList.get(i).get("id"))
//            list.add(categoryList.get(i).get("id"))
//            println(list)
//
//        }
// //       println("categoryList" + categoryList)
//        testContext.put("categoryIdList",list)
        return this
    }


}
