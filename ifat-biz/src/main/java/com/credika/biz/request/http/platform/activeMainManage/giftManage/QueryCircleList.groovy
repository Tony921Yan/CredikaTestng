package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class QueryCircleList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "CircleManage/queryCircleList"
        super.params = []
    }

    QueryCircleList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryCircleList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryCircleList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

//    GetCategoryList afterInvoke(TestContext testContext){
//        def apiResult = testContext.getResponse().data
//        if(apiResult==null){
//            println("暂无分类数据")
//            throw new SkipException("暂无分类数据")
//        }
//        testContext.put("id",apiResult.dataList.get(0).get(id))
//    }



}
