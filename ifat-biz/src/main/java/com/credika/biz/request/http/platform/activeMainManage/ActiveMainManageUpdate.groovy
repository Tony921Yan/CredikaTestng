package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageUpdate extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/update"
        super.params = ["type","copyWrite","name","title","remark","qrCode","posterPic","activeRule","groupQrcodeUrl","expiryStart","expiryEnd","preTime","status","secKillActivity","id"]
    }

    ActiveMainManageUpdate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManageUpdate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveMainManageUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
