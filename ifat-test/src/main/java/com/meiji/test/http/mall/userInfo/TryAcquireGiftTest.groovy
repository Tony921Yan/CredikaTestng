package com.meiji.test.http.mall.userInfo

import com.meiji.biz.api.MysqlAPI
import com.meiji.biz.request.http.mall.userInfo.TryAcquireGift
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class TryAcquireGiftTest extends BaseTest {
    TryAcquireGift tryAcquireGift = new TryAcquireGift()
    @Test(description = "领取礼包 tryAcquireGift" ,groups = ["prod","uat"],testName = "tryAcquireGift",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void tryAcquireGift(TestContext testContext){
        testContext .put("addressId",1450167892967456)
        testContext .put("giftId",1453422125514784)
        testContext .put("nickname","Tony Yan")
        testContext .put("avatar","https://thirdwx.qlogo.cn/mmopen/vi_32/qzaEHcSVEIg6SlTPX0eNfuz7tXu1jknTf666U0qbFNtN04ZThtaXFgPe6rWWicrQxvyIb7fVrHzM5luvoCib1CsA/132")
        tryAcquireGift.invoke(testContext).baseAssert(testContext)
    }


    @Test(description = "300个用户领礼品" ,groups = ["uat"],testName = "debug", dataProvider = "common",dataProviderClass = TestData.class)
    public void debug(TestContext testContext){
        List list = MysqlAPI.meiji_user.rows("select u.id as userId,u.nickname ,u.avatar,ua.id as addressId from user u left join user_address ua on u.id=ua.user_id where u.phone like '11%'")
        list.forEach{it->
            String userId = it.userId
            String addressId = it.addressId
            String nickname = it.nickname
            String avatar = it.avatar
            testContext.put("userId",userId)
            testContext .put("addressId",addressId)
            testContext .put("giftId",1453422125514784)
            testContext .put("nickname",nickname)
            testContext .put("avatar",avatar)
            tryAcquireGift.invoke(testContext).baseAssert(testContext)
        }
    }
}
