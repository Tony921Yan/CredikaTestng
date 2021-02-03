package com.miyuan.debug

import com.miyuan.api.SuningAPI
import com.suning.api.entity.netalliance.BacthcustomlinkQueryRequest
import com.suning.api.entity.netalliance.BacthcustomlinkQueryResponse
import org.testng.annotations.Test

class SuningDebug {
    @Test
    void test(){
        BacthcustomlinkQueryRequest req = new BacthcustomlinkQueryRequest()
        req.setExtend("208245")
        req.setSubUser("https://sugs.suning.com/I33Fg9uS")
        req.setCheckParam(false)
        BacthcustomlinkQueryResponse response = SuningAPI.bacthcustomlinkQuery(req)
        println(response.body.toString())
    }
}
