package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-14:25
 */
class QrGroupDetail extends ScrmGet{
    {
        super.api = "scrm/qrcode/group/detail"
        super.params = ["id"]
    }
}
