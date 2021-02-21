package com.meiji.request.api.goods

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class GetGoodsByPage extends BaseRequest{
    {
        super.interfaceName = "com.platform.goods.proxy.api.GoodsMgrService"
        super.methodName="getGoodsByPage"
        super.version="1.0"
        super.group="on"
        super.timeOut=3000
        super.paramsType=["com.platform.goods.proxy.vo.request.GoodsConditionRequestVO"]
        super.params = [["categoryId","spuCodeAndName","skuCode","startPrice","endPrice","startNum","endNum","startDate","endDate","pageNum","pageSize"]]
    }


    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

}
