package com.meiji.request.http.goods

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class GetPropertyBySpuld extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodsMgrService"  //接口路径
        super.methodName="getPropertyBySpuId"
        super.version="1.0"
        super.group="on"
        super.timeOut=3000
        super.paramsType = ["com.platform.goods.proxy.vo.request.PropertySearchRequestVO"] //请求参数
        super.params = ["spuId"]
    }


    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

}
