package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:18
 */
class QrGroupAdd extends ScrmPost{
    {
        super.api = "scrm/qrcode/group/add"
        super.params = ["departId",
                        "gmtCreate",
                        "gmtModified",
                        "id",
                        "name",
                        "qrCodeUrls",
                        "remark",
                        "shopId",
                        "state"]
    }
}
