package com.credika.test.debug

import com.credika.biz.api.MysqlAPI
import org.testng.annotations.Test
import org.xmind.core.*

class UserAnalysisDebug extends MysqlAPI{
    @Test
    public void allUserId(){
        //打印用户关系链
        Long inviteUserId = 1443992889720864
        printUser(inviteUserId)
    }

    static void printUser(Long userId){
        println(userId)
        List<Long> userList = inviteUserList(userId)
        for(Long id:userList){
            printUser(id)
        }
    }

    @Test
    public void test(){
        //打印xmind关系链
        Long inviteUserId = 1443992889720864
        IWorkbookBuilder workbookBuilder = Core.getWorkbookBuilder()
        IWorkbook workbook = workbookBuilder.createWorkbook()
        // 获得默认sheet
        ISheet primarySheet = workbook.getPrimarySheet()

        // 获得根主题
        ITopic rootTopic = primarySheet.getRootTopic()
        // 设置根主题的标题
        rootTopic.setTitleText("用户链分析")
        xmindDraw(workbook,rootTopic,inviteUserId)
        workbook.save( "D:/用户链分析.xmind")
    }

    private static void xmindDraw(IWorkbook workbook, ITopic rootTopic, Long userId){
        ITopic userTopic = workbook.createTopic()
        Map user = userInfo(userId)
        userTopic.setTitleText(user.nickname.toString())
        ITopic userDetail = workbook.createTopic()
        userDetail.setTitleText("用户信息")
        ITopic phone = workbook.createTopic()
        phone.setTitleText("手机号："+user.phone)
        userDetail.add(phone)
        ITopic gmtCreate = workbook.createTopic()
        gmtCreate.setTitleText("注册时间："+user.gmtCreate)
        userDetail.add(gmtCreate)
        userTopic.add(userDetail)
        List<Map> orderList = orderList(userId)
        if(orderList.size()>0){
            ITopic orders = workbook.createTopic()
            orders.setTitleText("订单列表")
            for(Map map:orderList) {
                ITopic order = workbook.createTopic()
                order.setTitleText("订单号："+ map.orderCode)
                ITopic orderPay = workbook.createTopic()
                orderPay.setTitleText("支付金额："+ map.payAmount+"（分）")
                ITopic orderGmt = workbook.createTopic()
                orderGmt.setTitleText("创建时间："+ map.gmtCreate)
                order.add(orderPay)
                order.add(orderGmt)
                orders.add(order)
            }
            userTopic.add(orders)
        }
        List<Long> userList = inviteUserList(userId)
        if(userList.size()>0){
            ITopic topicUserList = workbook.createTopic()
            topicUserList.setTitleText("邀请用户")
            for(Long subUserId:userList){
                xmindDraw(workbook,topicUserList,subUserId)
            }
            userTopic.add(topicUserList)
        }
        rootTopic.add(userTopic)
    }

    private static List<Long> inviteUserList(Long inviteUserId) {
        List inviteList = new ArrayList()
        List list = meiji_shop.rows("select user_id from shop_user_relation where inviter_user_id = $inviteUserId")
        list.forEach {
            inviteList.add(Long.valueOf(it.user_id as String))
        }
        return inviteList
    }

    private static List<Map> orderList(Long userId){
        List<Map> orderList = new ArrayList()
        List list = meiji_order.rows("select order_code,actually_paid_amount,gmt_create from order_info where buyer_id = $userId")
        list.forEach{
            Map map = new HashMap()
            map.put("orderCode",it.order_code)
            map.put("payAmount",it.actually_paid_amount)
            map.put("gmtCreate",it.gmt_create)
            orderList.add(map)
        }
        return orderList
    }

    private static Map userInfo(Long userId){
        Map user = new HashMap()
        Map map = meiji_user.firstRow("select nickname,phone,gmt_create from user where id = $userId")
        user.put("nickname",map.get("nickname"))
        user.put("phone",map.get("phone"))
        user.put("gmtCreate",map.get("gmt_create"))
        return user
    }
}
