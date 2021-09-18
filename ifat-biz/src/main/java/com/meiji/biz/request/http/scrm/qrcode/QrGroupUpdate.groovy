package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:38
 */
class QrGroupUpdate extends ScrmPost {
    {
        super.api = "scrm/qrcode/group/update"
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
