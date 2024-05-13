package com.credika.biz.request.http.scrm.channel

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:33
 */
class ChannelList extends ScrmPost{
    {
        super.api = "scrm/qrcode/channel/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }
}
