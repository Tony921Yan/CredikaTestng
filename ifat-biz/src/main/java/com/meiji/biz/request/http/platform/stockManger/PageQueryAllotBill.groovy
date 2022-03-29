package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class PageQueryAllotBill extends PlatformPost{
    {
        super.api="StockManage/pageQueryAllotBill"
        super.params = ["pageNum","pageSize"]
    }

    PageQueryAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageQueryAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageQueryAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageQueryAllotBill specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.data.getAt(0))
        Map mysqlResult = MysqlService.pageQueryAllotBill().get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total >10
//        assert mysqlResult.adjust_code == apiResult.data.getAt(0).getAt("adjustCode")
//        assert mysqlResult.adjust_type == apiResult.data.getAt(0).getAt("adjustType")
//        assert mysqlResult.adjust_status == apiResult.data.getAt(0).getAt("adjustStatus")
//        assert mysqlResult.adjust_obj == apiResult.data.getAt(0).getAt("adjustObj")
//        assert mysqlResult.adjust_obj_desc == apiResult.data.getAt(0).getAt("adjustObjDesc")
//        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.data.getAt(0).getAt("gmtCreate"))





    }

}
