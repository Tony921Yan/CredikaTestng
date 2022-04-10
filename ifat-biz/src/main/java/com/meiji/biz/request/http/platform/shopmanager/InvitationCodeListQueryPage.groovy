package com.meiji.biz.request.http.platform.shopmanager

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class InvitationCodeListQueryPage extends PlatformPost {
    {
        super.api = "invitationCodeList/queryPage"
        super.params = ["pageNum","pageSize","code","validDate","usedShopDealerPhone","shopDealerPhone"]
    }

    InvitationCodeListQueryPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InvitationCodeListQueryPage preInvoke(TestContext testContext) {
        super.preInvoke(testContext)
        return this
    }

    InvitationCodeListQueryPage baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }
    InvitationCodeListQueryPage specialAssert(TestContext testContext) {
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.invitationCodeListQueryPage()
        System.out.println("apiResult"+apiResult)
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total >20
        assert mysqlResult.code == apiResult.dataList.getAt(2).getAt("code")
        assert mysqlResult.id == apiResult.dataList.getAt(2).getAt("inviteCodeId")
        assert mysqlResult.shop_id == apiResult.dataList.getAt(2).getAt("shopId")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.dataList.getAt(2).getAt("gmtCreate"))
        assert DateUtil.strToDate(mysqlResult.gmt_modified as String) == DateUtil.strToDate(apiResult.dataList.getAt(2).getAt("gmtModified"))
        System.out.println("mysqlResult"+apiResult.dataList.getAt(2).getAt("code"))
        return this
    }
}
