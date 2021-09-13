package com.meiji.biz.request.http.scrm.contacttag

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/13-10:29
 */
class ContactTagUpdate extends ScrmPost{
    {
        super.api = "scrm/contactTag/update"
        super.params = ["customerId","tagIds"]
    }
}
