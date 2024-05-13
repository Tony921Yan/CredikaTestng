package com.credika.biz.request.http.mall.userShop

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/16-10:48
 */
class GetTemplateDefaultComponentList extends MallPost{
    {
        super.api = "home/getTemplateDefaultComponentList"
        super.params=[]
    }

    GetTemplateDefaultComponentList invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetTemplateDefaultComponentList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
