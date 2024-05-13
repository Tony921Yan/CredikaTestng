package com.credika.biz.request.http.scrm.tagGroup

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-16:26
 */
class TagGroupQuery extends ScrmPost{
    {
        super.api = "scrm/tagGroup/query"
        super.params = []
    }
}
