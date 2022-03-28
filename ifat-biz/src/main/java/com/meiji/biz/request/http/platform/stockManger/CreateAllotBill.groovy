package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CreateAllotBill extends PlatformPost{
    {
        super.api="StockManage/createAllotBill"
        super.params = ["adjustObj","adjustObjDesc","adjustObjType","adjustType","createBy","operation","remark","goods","goodsName","preNum","skuCode","skuId","spuCode","spuId"]
    }

    CreateAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CreateAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
