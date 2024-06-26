package com.credika.biz.request.http.platform.raffleActivity


import com.miyuan.ifat.support.test.TestContext

class SearchRaffledRecord extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="LuckyManage/searchRaffledRecord"
        super.params = ["condition","page","rows"]
    }

    SearchRaffledRecord invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchRaffledRecord preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchRaffledRecord baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    SearchRaffledRecord specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = com.credika.biz.service.MysqlService.searchRaffledRecord().get(0)
        System.out.println("apiResult" + apiResult)
        System.out.println("mysqlResult" + mysqlResult)
        assert apiResult.total != 20
        assert apiResult.dataList.getAt(0).getAt("raffleActId") == mysqlResult.raffle_act_id
        assert apiResult.dataList.getAt(0).getAt("userPhoneNumber") == mysqlResult.user_phone_number
        assert apiResult.dataList.getAt(0).getAt("userAvatar") == mysqlResult.user_avatar
        assert apiResult.dataList.getAt(0).getAt("raffleItemId") == mysqlResult.raffle_item_id
        assert com.credika.biz.util.DateUtil.strToDate(mysqlResult.gmt_create as String) == com.credika.biz.util.DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtCreate"))
        return this
    }
}