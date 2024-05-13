package com.credika.biz.request.http.scrm.tag

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:17
 */
class TagList extends ScrmPost{
    {
        super.api = "scrm/tag/list"
        super.params = ["condition", "order", "page", "rows", "sort"]
    }
}
