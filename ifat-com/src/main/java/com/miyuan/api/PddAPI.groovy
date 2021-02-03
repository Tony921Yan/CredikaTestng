package com.miyuan.api

import com.miyuan.factory.FactorySupport
import com.pdd.pop.sdk.http.PopClient
import com.pdd.pop.sdk.http.api.pop.request.PddDdkResourceUrlGenRequest
import com.pdd.pop.sdk.http.api.pop.response.PddDdkResourceUrlGenResponse

class PddAPI {
    @Lazy
    static PopClient popClient = FactorySupport.createPddClient("pdd")
    static PddDdkResourceUrlGenResponse PddDdkResourceUrlGen(PddDdkResourceUrlGenRequest request){
        return popClient.syncInvoke(request);
    }
}
