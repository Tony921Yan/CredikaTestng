package com.meiji.biz.request.http.platform.hfjy.menu
import com.meiji.biz.request.http.platform.PlatformGet
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
class List extends PlatformGet{
    {
        super.api="/platform/menu/list"
        super.params = []
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    List specialAssert(TestContext testContext){
        ArrayList mysqlResult = MysqlService.list()
        ArrayList apiResult = testContext.getResponse().data
        println(apiResult.get(0).getAt("chidrenMenuList").get(0))
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("path") == mysqlResult.get(0).getAt("path")
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("id") == mysqlResult.get(0).getAt("id")
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("name") == mysqlResult.get(0).getAt("name")
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("sort") == mysqlResult.get(0).getAt("sort")
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("parentId") == mysqlResult.get(0).getAt("parent_id")
        assert apiResult.get(0).getAt("chidrenMenuList").get(0).getAt("status") == mysqlResult.get(0).getAt("status")

    }
}
