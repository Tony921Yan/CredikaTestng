package com.meiji.request.api.brand

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class CreateGoodProperty extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodPropertyMgrService"  //接口路径
        super.methodName="createGoodProperty"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.GoodPropertyDetailVO"] //请求参数
        super.params = [["name","isMust","remark","createBy","goodPropertyValues"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
