package com.meiji.biz.request.http.mall.user

import com.meiji.biz.request.http.mall.MallPost

class CheckGrayUser extends MallPost{
    {
        super.api = "/user/checkGrayUser"
        super.params =  ["grayUserId"]
    }
}
