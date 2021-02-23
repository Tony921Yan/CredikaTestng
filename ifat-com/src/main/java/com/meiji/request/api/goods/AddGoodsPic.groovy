package com.meiji.request.api.goods

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class AddGoodsPic extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodsMgrService"  //接口路径
        super.methodName="addGoodsPic"
        super.version="1.0"
        super.group="on"
        super.timeOut=3000
        super.paramsType=["com.platform.goods.proxy.vo.request.PicAddRequestVO"] //请求参数
        super.params = [["url","sort"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

}
