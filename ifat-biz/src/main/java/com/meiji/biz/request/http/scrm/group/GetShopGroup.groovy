package com.meiji.biz.request.http.scrm.group

import com.meiji.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-14:13
 */
class GetShopGroup extends ScrmGet{
    {
        super.api = "scrm/group/getShopGroup"
        super.params = ["shopId"]
    }
}
