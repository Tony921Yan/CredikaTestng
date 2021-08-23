package com.meiji.biz.request.http.scrm.login

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.request.http.scrm.ScrmGet
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-9:28
 */
class QrCode extends ScrmGet{
    {
        super.api = "scrm/login/qrCode"  //前端接口
        super.params=["loginType"]
    }



}
