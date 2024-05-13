package com.credika.biz.request.http.platform.label


import com.miyuan.ifat.support.test.TestContext

class AddLabel extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="goodsLabelList/addGoodsLabel"
        super.params = ["gmtCreate","gmtModified","id","isDelete","labelColor","labelName","labelRemark","labelType",
        "page","rows","showType"]
    }

    AddLabel invoke(TestContext testContext) {
        com.credika.biz.service.MysqlService.deleteLabel(testContext.get("labelName"))
        super.invoke(testContext)
        return this
    }

    AddLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
