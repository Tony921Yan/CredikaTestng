package com.meiji.request.api.category

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class GetCategoryByName extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.CategoryMgrService"  //接口路径
        super.methodName="getCategoryByName"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.CategorySearchBaseRequestVO"] //请求参数
        super.params = [["name","type"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
