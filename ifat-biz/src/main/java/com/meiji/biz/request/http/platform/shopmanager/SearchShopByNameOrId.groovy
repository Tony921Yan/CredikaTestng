package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchShopByNameOrId extends PlatformPost{
    {
        super.api = "ShopManage/searchShopByNameOrId"    //接口地址
        super.params = ["keyword"]                       //接口参数
    }

    SearchShopByNameOrId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchShopByNameOrId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchShopByNameOrId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
