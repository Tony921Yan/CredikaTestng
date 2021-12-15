package com.meiji.biz.request.http.platform.user

import com.meiji.biz.request.http.platform.PlatformPost

class CheckGrayUser extends PlatformPost{
    {
        super.api = "/user/checkGrayUser"
        super.params =  ["grayUserId"]
    }
}
