package com.credika.biz.request.http.scrm.contacttag

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/13-9:38
 */
class TagShow extends ScrmGet{
    {
        super.api = "scrm/contactTag/show"
        super.params = ["tagIds"]
    }

}
