package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class InvitationCodeListQueryPage extends PlatformPost {
    {
        super.api = "/invitationCodeList/queryPage"
        super.params =  [ "pageNum","pageSize","code","validDate","usedShopDealerPhone","shopDealerPhone"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost specialAssert(TestContext testContext) {
        Map mysqlDate = MysqlService.invitationCodeListQueryPage(testContext.get("pageSize")).get(0)
//        Map apiDate = testContext.getResponse().data
        List<Map> response = testContext.getResponse().data.dataList
        String inviteCodeId = null;
        for(Map map:response){
            inviteCodeId = map.inviteCodeId
//            print(inviteCodeId)
            System.out.print(inviteCodeId)
        }
        print(123)
        System.out.print(1234)
   //     System.out.print(response)
//        List<Map> list = apiDate.dataList
//        System.out.print("apiDate:" +list.get(0).shopDealerId)

//        assert mysqlDate.code == apiDate.code
//        assert apiDate.total >20
//    }
    }
}
