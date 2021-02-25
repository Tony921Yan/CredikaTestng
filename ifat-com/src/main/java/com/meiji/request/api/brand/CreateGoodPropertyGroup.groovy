package com.meiji.request.api.brand

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class CreateGoodPropertyGroup extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodPropGroupMgrService"  //接口路径
        super.methodName="createGoodPropertyGroup"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.GoodPropertyGroupVO"] //请求参数
        super.params = [["name","code","categoryId","status","remark","createBy","list"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
