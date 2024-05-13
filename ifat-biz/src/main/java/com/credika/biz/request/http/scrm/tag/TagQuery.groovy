package com.credika.biz.request.http.scrm.tag
/**
 *
 @author s1mple
 @create 2021/8/23-16:21
 */
class TagQuery extends com.credika.biz.request.http.scrm.ScrmGet{
    {
        super.api = "scrm/tag/query"
        super.params=["groupId"]
    }
}
