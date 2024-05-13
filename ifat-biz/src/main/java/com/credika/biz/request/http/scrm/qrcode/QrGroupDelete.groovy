package com.credika.biz.request.http.scrm.qrcode

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-14:23
 */
class QrGroupDelete extends ScrmGet{
    {
        super.api = "scrm/qrcode/group/delete"
        super.params = ["id"]
    }
}
