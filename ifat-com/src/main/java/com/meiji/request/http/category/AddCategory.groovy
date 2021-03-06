package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class AddCategory extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.CategoryMgrService"  //接口路径
        super.methodName="addCategory"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.CategoryAddRequestVO"] //请求参数
        super.params = [["type","sort","parentId","parentName","name","icon","status","createBy"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
