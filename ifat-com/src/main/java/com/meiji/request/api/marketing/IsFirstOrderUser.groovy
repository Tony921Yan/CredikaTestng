package com.meiji.request.api.marketing

import com.meiji.com.TestContext
import com.meiji.request.api.BaseRequest

class IsFirstOrderUser extends BaseRequest{
    {
        super.interfaceName = "com.miyuan.service.marketing.api.UserOrderPullNewActivityService"
        super.methodName="isFirstOrderUser"
        super.version="1.0"
        super.timeOut=3000
        super.paramsType=["java.lang.Integer"]
        super.params = [["userId"]]
    }


    BaseRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

}
