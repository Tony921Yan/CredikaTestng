package com.miyuan.debug

import com.miyuan.api.PddAPI
import com.pdd.pop.sdk.http.api.pop.request.PddDdkResourceUrlGenRequest
import com.pdd.pop.sdk.http.api.pop.response.PddDdkResourceUrlGenResponse
import org.testng.annotations.Test

class PddDebug {
    @Test
    void test(){
        PddDdkResourceUrlGenRequest request = new PddDdkResourceUrlGenRequest()
        request.setCustomParameters("23177620");
        request.setGenerateWeApp(true);
        request.setPid("40005_153624308");
        request.setUrl("https://p.pinduoduo.com/m5hyIRIi");
        PddDdkResourceUrlGenResponse response = PddAPI.PddDdkResourceUrlGen(request)
        println(response.resourceUrlResponse.singleUrlList.shortUrl)
    }
}
