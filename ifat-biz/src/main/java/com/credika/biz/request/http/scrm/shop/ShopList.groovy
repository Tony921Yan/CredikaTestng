package com.credika.biz.request.http.scrm.shop

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:28
 */
class ShopList extends ScrmPost {
    {
        super.api = "scrm/shop/list"
        super.params = ["condition",
                        "order",
                        "page",
                        "rows",
                        "sort"]
    }
}
