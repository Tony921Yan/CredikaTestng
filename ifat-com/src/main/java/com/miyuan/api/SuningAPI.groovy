package com.miyuan.api

import com.miyuan.factory.FactorySupport
import com.suning.api.DefaultSuningClient
import com.suning.api.entity.netalliance.BacthcustomlinkQueryRequest
import com.suning.api.entity.netalliance.BacthcustomlinkQueryResponse

class SuningAPI {
    @Lazy
    private static DefaultSuningClient defaultSuningClient= FactorySupport.createSuningClient("suning")

    static BacthcustomlinkQueryResponse bacthcustomlinkQuery(BacthcustomlinkQueryRequest req){
        return defaultSuningClient.excute(req)
    }

}
