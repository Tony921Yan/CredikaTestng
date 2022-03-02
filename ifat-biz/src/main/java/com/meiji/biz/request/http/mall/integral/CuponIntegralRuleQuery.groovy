package com.meiji.biz.request.http.mall.integral
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.junit.Assert

class CuponIntegralRuleQuery extends MallPost {
    {
        super.api = "integral/couponIntegralRuleQuery"
        super.params = ["userId", "page", "rows"]
    }

    CuponIntegralRuleQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CuponIntegralRuleQuery baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }

    CuponIntegralRuleQuery specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        assert apiResult.total <= 20
        return this

    }
}