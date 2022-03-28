package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class QueryAllotBillDetail extends PlatformPost{
    {
        super.api="StockManage/queryAllotBillDetail"
        super.params = ["adjustId"]
    }

    QueryAllotBillDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryAllotBillDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryAllotBillDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    QueryAllotBillDetail specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = MysqlService.queryAllotBillDetail(testContext.get("adjustId")).get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.goods_name == apiResult.goods.getAt(0).getAt("goodsName")
        assert mysqlResult.spu_id == apiResult.goods.getAt(0).getAt("spuId")
        assert mysqlResult.spu_code == apiResult.goods.getAt(0).getAt("spuCode")
        assert mysqlResult.sku_id == apiResult.goods.getAt(0).getAt("skuId")
        assert mysqlResult.sku_code == apiResult.goods.getAt(0).getAt("skuCode")
        assert mysqlResult.pre_num == apiResult.goods.getAt(0).getAt("preNum")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
    }

}
