package com.meiji.test.other.data
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.util.DateUtil
import com.miyuan.ifat.support.util.DingTalkUtil
import org.testng.annotations.Test
import java.math.RoundingMode

class DataAnalysis{
    @Test(groups = ["prod"])
    void analysis(){
        StringBuilder stringBuilder = new StringBuilder()
        Date date = new Date()
        String beginTime =DateUtil.getMonthFirstDay(date)
        String endTime = DateUtil.getMonthLastDay(date)
        String month = DateUtil.getMonth(date)
        stringBuilder.append("<font color=#000000 size=5 >**$month 月份数据分析**</font>  \n")
        Map commonOrder = MysqlService.getOrderCntByType(beginTime,endTime,"1")
        BigDecimal commonOrderCnt = new BigDecimal(commonOrder.get("cnt").toString())
        BigDecimal commonOrderAmount = new BigDecimal(commonOrder.get("amount").toString()).divide(new BigDecimal(100),2, RoundingMode.HALF_DOWN)
        Map giftOrder = MysqlService.getOrderCntByType(beginTime,endTime,"3")
        BigDecimal giftOrderCnt = new BigDecimal(giftOrder.get("cnt").toString())
        BigDecimal giftOrderAmount = new BigDecimal(giftOrder.get("amount").toString()).divide(new BigDecimal(100),2, RoundingMode.HALF_DOWN)
        Map outSideOrder = MysqlService.getOrderCntByType(beginTime,endTime,"2")
        BigDecimal outSideOrderCnt = new BigDecimal(outSideOrder.get("cnt").toString())
        BigDecimal outSideOrderAmount = new BigDecimal(outSideOrder.get("amount").toString()).divide(new BigDecimal(100),2, RoundingMode.HALF_DOWN)
        BigDecimal totalOrderCnt = commonOrderCnt+giftOrderCnt+outSideOrderCnt
        BigDecimal totalOrderAmount =commonOrderAmount+giftOrderAmount+outSideOrderAmount
        BigDecimal commonCntRatio = new BigDecimal(0)
        BigDecimal giftCntRatio = new BigDecimal(0)
        BigDecimal outSideCntRatio = new BigDecimal(0)
        if(totalOrderCnt>0){
            commonCntRatio = (commonOrderCnt * new BigDecimal(100)).divide(totalOrderCnt,2,RoundingMode.HALF_DOWN)
            giftCntRatio = (giftOrderCnt*new BigDecimal(100)).divide(totalOrderCnt,2,RoundingMode.HALF_DOWN)
            outSideCntRatio = 100-commonCntRatio-giftCntRatio
        }
        BigDecimal commonAmountRatio = new BigDecimal(0)
        BigDecimal giftAmountRatio = new BigDecimal(0)
        BigDecimal outSideAmountRatio = new BigDecimal(0)
        if(totalOrderAmount>0) {
            commonAmountRatio = (commonOrderAmount * new BigDecimal(100)).divide(totalOrderAmount, 2, RoundingMode.HALF_DOWN)
            giftAmountRatio = (giftOrderAmount * new BigDecimal(100)).divide(totalOrderAmount, 2, RoundingMode.HALF_DOWN)
            outSideAmountRatio = 100 - commonAmountRatio - giftAmountRatio
        }
        String showTotalOrderAmount =  totalOrderAmount>=10000?totalOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":totalOrderAmount+"元"
        stringBuilder.append("<font color=#000000 size=4 >**总订单数量：$totalOrderCnt**</font>  \n")
        stringBuilder.append("<font color=#000000 size=4 >**总金额：$showTotalOrderAmount**</font>  \n")
        stringBuilder.append("<font color=#000000 size=3 >**订单类型** </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 普通订单数量：$commonOrderCnt, 占比：$commonCntRatio% </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 送礼订单数量：$giftOrderCnt, 占比：$giftCntRatio%</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 跨境订单数量：$outSideOrderCnt, 占比：$outSideCntRatio%</font>  \n")
        String showCommonOrderAmount = commonOrderAmount>=10000?commonOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":commonOrderAmount+"元"
        String showGiftOrderAmount = giftOrderAmount>=10000?giftOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":giftOrderAmount+"元"
        String showOutSideOrderAmount = outSideOrderAmount>=10000?outSideOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":outSideOrderAmount+"元"
        stringBuilder.append("<font color=#000000 size=2 > 普通订单金额：$showCommonOrderAmount</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 普通订单金额占比：$commonAmountRatio% </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 送礼订单金额：$showGiftOrderAmount</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 送礼订单金额占比：$giftAmountRatio%</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 跨境订单金额：$showOutSideOrderAmount</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 跨境订单金额占比：$outSideAmountRatio%</font>  \n")

        Map NaturalOrder = MysqlService.getNaturalOrderCnt(beginTime,endTime)
        BigDecimal naturalOrderCnt = new BigDecimal(NaturalOrder.get("cnt").toString())
        BigDecimal naturalOrderAmount = new BigDecimal(NaturalOrder.get("amount").toString()).divide(new BigDecimal(100),2, RoundingMode.HALF_DOWN)
        Map CPSOrder = MysqlService.getCPSOrderCnt(beginTime,endTime)
        BigDecimal cpsOrderCnt = new BigDecimal(CPSOrder.get("cnt").toString())
        BigDecimal cpsOrderAmount = new BigDecimal(CPSOrder.get("amount").toString()).divide(new BigDecimal(100), 2,RoundingMode.HALF_DOWN)
        BigDecimal totalSourceOrderCnt = naturalOrderCnt+cpsOrderCnt
        BigDecimal totalSourceAmount = naturalOrderAmount + cpsOrderAmount
        BigDecimal naturalCntRatio = new BigDecimal(0)
        BigDecimal cpsCntRatio = new BigDecimal(0)
        if(totalSourceOrderCnt>0){
            naturalCntRatio = (naturalOrderCnt * new BigDecimal(100)).divide(totalSourceOrderCnt,2,RoundingMode.HALF_DOWN)
            cpsCntRatio =  100 - naturalCntRatio
        }
        BigDecimal naturalAmountRatio = new BigDecimal(0)
        BigDecimal cpsAmountRatio = new BigDecimal(0)
        if(totalSourceAmount>0){
            naturalAmountRatio = (naturalOrderAmount * new BigDecimal(100)).divide(totalSourceAmount,2,RoundingMode.HALF_DOWN)
            cpsAmountRatio =  100 - naturalAmountRatio
        }
        stringBuilder.append("<font color=#000000 size=3 >**订单来源**</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 自然订单数量：$naturalOrderCnt, 占比：$naturalCntRatio% </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > CPS订单数量：$cpsOrderCnt, 占比：$cpsCntRatio%</font>  \n")
        String showNaturalOrderAmount = naturalOrderAmount>=10000?naturalOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":naturalOrderAmount+"元"
        String showCpsOrderAmount = cpsOrderAmount>=10000?cpsOrderAmount.divide(new BigDecimal(10000),2,RoundingMode.HALF_DOWN)+"万元":cpsOrderAmount+"元"
        stringBuilder.append("<font color=#000000 size=2 > 自然订单金额：$showNaturalOrderAmount</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 自然订单金额占比：$naturalAmountRatio% </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > CPS订单金额：$showCpsOrderAmount</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > CPS订单金额占比：$cpsAmountRatio%</font>  \n")

        Map allUser = MysqlService.getUserOrderCnt(beginTime,endTime)
        Map repeatUser = MysqlService.getRepeatUserOrderCnt(beginTime,endTime)
        BigDecimal allUserCnt = new BigDecimal(allUser.get("cnt").toString())
        BigDecimal repeatUserCnt = new BigDecimal(repeatUser.get("cnt").toString())
        BigDecimal repeatRatio = new BigDecimal(0)
        if (allUserCnt>0){
            repeatRatio = (repeatUserCnt * new BigDecimal(100)).divide(allUserCnt,2,RoundingMode.HALF_DOWN)
        }
        stringBuilder.append("<font color=#000000 size=3 >**复购率**</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 复购用户数：$repeatUserCnt</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 下单用户：$allUserCnt</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 复购率：$repeatRatio%</font>  \n")
        Map orderShop = MysqlService.getOrderShopCnt(beginTime,endTime)
        BigDecimal orderShopCnt = new BigDecimal(orderShop.get("cnt").toString())
        Map allShop = MysqlService.getAllShopCnt()
        BigDecimal allShopCnt = new BigDecimal(allShop.get("cnt").toString())
        BigDecimal activeShopRatio = new BigDecimal(0)
        if(allUserCnt>0){
            activeShopRatio = (orderShopCnt * new BigDecimal(100)).divide(allUserCnt,2,RoundingMode.HALF_DOWN)
        }
        stringBuilder.append("<font color=#000000 size=3 >**活跃店主**</font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 活跃店主数:$orderShopCnt </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 总店主数:$allShopCnt </font>  \n")
        stringBuilder.append("<font color=#000000 size=2 > 活跃店主占比:$activeShopRatio% </font>  \n")
        println(stringBuilder)
//        DingTalkUtil.send("https://oapi.dingtalk.com/robot/send?access_token=c964840998da4cd0a24d09b7cdff741f24e30f07de8c31ee282d683cba9dab3f",
//        "SEC49e9bb88652b0dfdbf6ee9aa3d211cdbc52ab890a9b4536136344a8421a81b39",
//                "业务信息"
//                ,stringBuilder.toString())
    }
}