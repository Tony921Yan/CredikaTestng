package com.miyuan.debug

import com.miyuan.api.TaoBaoAPI
import com.miyuan.util.MapUtil
import com.taobao.api.request.TbkDgMaterialOptionalRequest
import com.taobao.api.request.TbkDgOptimusMaterialRequest
import com.taobao.api.request.TbkTpwdConvertRequest
import com.taobao.api.response.TbkDgMaterialOptionalResponse
import com.taobao.api.response.TbkDgOptimusMaterialResponse
import com.taobao.api.response.TbkTpwdConvertResponse
import org.testng.annotations.Test

class TaobaoDebug {

    @Test
    void test(){
        for(int i=0;i<1;i++) {
            TbkTpwdConvertRequest req = new TbkTpwdConvertRequest();
            req.setPasswordContent("/3BIlcuqgHh0/");
            req.setAdzoneId(108870250016);
            TbkTpwdConvertResponse response = TaoBaoAPI.tbkTpwdConvert(req)
            println(MapUtil.objToMap(response))
        }
    }
    @Test
    void test2(){
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setAdzoneId(28176750484)
        req.setItemId(632844356146L)
        req.setMaterialId(20150318020002380L);
        req.setPageSize(10)
        req.setPageNo(1)
        TbkDgOptimusMaterialResponse response = TaoBaoAPI.tbkDgOptimusMaterial(req)
        println(MapUtil.objToMap(response))
    }

    @Test
    void test3(){
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setAdzoneId(96562750278L)
        req.setQ("鞋子")
        req.setRelationId("2606034661")
        req.setPageNo(1)
        req.setPageSize(10)
        req.setStartPrice(1L)
        req.setEndKaTkRate(10000L)
        TbkDgMaterialOptionalResponse response = TaoBaoAPI.bkDgMaterialOptional(req)
        println(MapUtil.objToMap(response))
    }


}
