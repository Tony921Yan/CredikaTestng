package com.credika.biz.request.http.scrm.shop

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:22
 */
class ShopDel extends ScrmPost{
    {
        super.api = "scrm/shop/delete"
        super.params = ["id"]
    }
}
