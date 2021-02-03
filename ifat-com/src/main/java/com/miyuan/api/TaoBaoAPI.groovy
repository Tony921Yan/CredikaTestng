package com.miyuan.api

import com.miyuan.factory.FactorySupport
import com.taobao.api.TaobaoClient
import com.taobao.api.request.TbkDgMaterialOptionalRequest
import com.taobao.api.request.TbkDgOptimusMaterialRequest
import com.taobao.api.request.TbkTpwdConvertRequest
import com.taobao.api.response.TbkDgMaterialOptionalResponse
import com.taobao.api.response.TbkDgOptimusMaterialResponse
import com.taobao.api.response.TbkTpwdConvertResponse

class TaoBaoAPI {

    static TbkTpwdConvertResponse tbkTpwdConvert(TbkTpwdConvertRequest req){
        TbkTpwdConvertResponse response = getTaobaoClient(req.getAdzoneId()).execute(req);
        return response
    }

    static TbkDgOptimusMaterialResponse tbkDgOptimusMaterial(TbkDgOptimusMaterialRequest req){
        TbkDgOptimusMaterialResponse response =getTaobaoClient(req.getAdzoneId()).execute(req);
        return response
    }

    static TbkDgMaterialOptionalResponse bkDgMaterialOptional(TbkDgMaterialOptionalRequest req){
        TbkDgMaterialOptionalResponse response =getTaobaoClient(req.getAdzoneId()).execute(req);
        return response
    }

    private static TaobaoClient getTaobaoClient(Long adzoneId){
        TaobaoClient taobaoClient = FactorySupport.createTopClient("top-"+String.valueOf(adzoneId))
        if (taobaoClient==null){
            taobaoClient =  FactorySupport.createTopClient("top-default")
        }
        return taobaoClient
    }
}