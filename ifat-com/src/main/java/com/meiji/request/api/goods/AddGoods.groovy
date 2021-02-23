package com.meiji.request.api.goods

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class AddGoods extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodsMgrService"  //接口路径
        super.methodName="addGoods"
        super.version="1.0"
        super.group="on"
        super.timeOut=3000
        super.paramsType=["com.platform.goods.proxy.vo.request.SpuAddRequestVO"] //请求参数
        super.params = [["uuid","name","sellingPoint","originAddress","brandId","frontDeskCategoryId",
                         "backgroundCategoryId","manyProperty","createBy","updateBy","pics","detail","skus"]]
    }

    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        println(testContext)
        return this
    }
}
