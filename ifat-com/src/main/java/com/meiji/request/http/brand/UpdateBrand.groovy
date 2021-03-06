package com.meiji.request.http.brand

import com.meiji.com.TestContext
import com.meiji.request.http.BaseRequest

class UpdateBrand extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.BrandMgrService"  //接口路径
        super.methodName="updateBrand"
        super.version="1.0"
        super.group="on"
        super.timeOut=10000
        super.paramsType=["com.platform.goods.proxy.vo.request.UpdateBrandReqVO"] //请求参数
        super.params = [["name","id","icon","remark","updateBy"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
