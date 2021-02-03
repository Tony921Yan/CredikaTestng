package com.miyuan.debug

import com.miyuan.api.VipAPI
import com.vip.adp.api.open.service.UrlGenResponse
import org.junit.Test

class VipDebug {
    @Test
    void test(){
        UrlGenResponse urlGenResponse = VipAPI.genByVIPUrl(["https://t.vip.com/5fBNZnloVC8"], "111111")
        urlGenResponse.getUrlInfoList().each {println(it.url)}
    }
}
