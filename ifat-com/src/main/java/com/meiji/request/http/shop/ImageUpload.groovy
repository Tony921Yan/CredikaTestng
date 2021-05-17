package com.meiji.request.http.shop

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet

class ImageUpload extends MeijiGet {
    {
        super.api = "/shop/pay/imageUpload?imageUrl=http%3A%2F%2Fstatic.meiji8888.com%2Fbuck%2F3.jpg" //不要轻易上传
        //将http://static.meiji8888.com/buck/3.jpg用浏览器F12进行转译成http%3A%2F%2Fstatic.meiji8888.com%2Fbuck%2F3.jpg
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
