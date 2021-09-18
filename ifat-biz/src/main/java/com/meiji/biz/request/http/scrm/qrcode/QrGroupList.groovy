package com.meiji.biz.request.http.scrm.qrcode

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:28
 */
class QrGroupList extends ScrmPost{
    {
        super.api = "scrm/qrcode/group/list"
        super.params = [
                "condition",
                "order",
                "page",
                "rows",
                "sort"]
    }
}
