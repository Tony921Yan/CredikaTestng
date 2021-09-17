package com.meiji.biz.request.http.scrm.corp

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/17-10:23
 */
class CorpUpdate extends ScrmPost{
    {
        super.api = "scrm/corp/update"
        super.params = ["legalPerson",
                        "mailAddress",
                        "name",
                        "phone",
                        "verifyCode"]
    }
}
