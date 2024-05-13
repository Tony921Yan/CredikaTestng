package com.credika.biz.request.http.scrm.corp
/**
 *
 @author s1mple
 @create 2021/9/17-10:23
 */
class CorpUpdate extends com.credika.biz.request.http.scrm.ScrmPost{
    {
        super.api = "scrm/corp/update"
        super.params = ["legalPerson", "mailAddress", "name", "phone", "verifyCode"]
    }
}
