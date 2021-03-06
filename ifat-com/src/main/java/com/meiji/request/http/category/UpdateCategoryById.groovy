package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class UpdateCategoryById extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.CategoryMgrService"  //接口路径
        super.methodName="updateCategoryById"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.CategoryUpdateRequestVO"] //请求参数
        super.params = [["list"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
