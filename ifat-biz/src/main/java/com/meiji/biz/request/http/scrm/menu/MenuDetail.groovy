package com.meiji.biz.request.http.scrm.menu

import com.meiji.biz.request.http.scrm.ScrmGet
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/20-15:29
 */
class MenuDetail extends ScrmGet{
    {
        super.api = "scrm/menu/detail"
        super.params = ["idList", "corpId"]
    }
}
