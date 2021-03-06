package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class GoodPropertyDetail extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodPropertyMgrService"  //接口路径
        super.methodName="goodPropertyDetail"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.GoodPropertyDetailVO"] //请求参数
        super.params = [["id"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
