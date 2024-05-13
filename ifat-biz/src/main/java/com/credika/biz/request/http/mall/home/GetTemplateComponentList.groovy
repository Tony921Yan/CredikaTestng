package com.credika.biz.request.http.mall.home

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetTemplateComponentList extends MallPost {
    {
        super.api = "home/getTemplateComponentList"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetTemplateComponentList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTemplateComponentList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTemplateComponentList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
