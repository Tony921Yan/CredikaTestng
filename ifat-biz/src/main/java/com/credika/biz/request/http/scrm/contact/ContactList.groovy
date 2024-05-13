package com.credika.biz.request.http.scrm.contact

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/20-16:02
 */
class ContactList extends ScrmPost{
    {
        super.api = "scrm/contact/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }
}
