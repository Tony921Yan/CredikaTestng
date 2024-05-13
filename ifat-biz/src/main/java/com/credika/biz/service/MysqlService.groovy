package com.credika.biz.service


import com.miyuan.ifat.support.util.JsonUtil
import org.apache.commons.lang3.StringUtils
import org.testng.SkipException

class MysqlService extends com.credika.biz.api.MysqlAPI {

    static Map getBrand(String id){
        return meiji_goods.firstRow("select * from goods_brand where id = $id")
    }

    static List getCategoryById(String id){
        return meiji_goods.rows("select * from goods_category where id=$id")
    }

    static List getCategoryByType(String type){
        return meiji_goods.rows("select * from goods_category where type = $type")
    }

    static List prodElectronicContractdetail(String contractId){
        return meiji_supplier.rows("select * from contract where id = $contractId")
    }

    static Map FreightTemplateQueryPage(){
        return meiji_supplier.rows("SELECT * FROM `freight_template` WHERE supplier_id = 77 AND deleted  = 0 ORDER BY id DESC Limit 20").get(0)
    }

    static List prodElectronicContractDownload(Integer contractId){
        return meiji_supplier.rows("select * from contract where id = $contractId")
    }

    static List prodQueryPage(String rows){
        return meiji_supplier.rows("select count(*) as contTotal from contract ")
    }

    static Map invitationCodeListQueryPage(){
        return meiji_shop.rows("select *  from invite_code  order by id desc limit 20").get(2)
    }

    static Map costPerSalesListGetCpsGoods(){
        return meiji_goods.firstRow("select * from meiji_goods.goods_spu WHERE code = '200sup39806'")
    }

    static Map costPerSalesListGetCurrentCategoryGoods(String id){
        return meiji_goods.rows("SELECT * FROM meiji_goods.cps_goods_relationship WHERE cps_category_id = $id").get(0)
    }

    static Map costPerSalesListGetSelectedGoods(){
        return meiji_goods.rows("SELECT * FROM `meiji_goods`.`cps_goods_relationship` WHERE `cps_category_id` = '1441958675349536'").get(1)
    }

    static List addCategory(String type,String sort){
        return meiji_goods.rows("select * from goods_category where type = $type and sort = $sort")
    }

    static List getCategory(String type,String name){
        return meiji_goods.rows("select * from goods_category where type = $type and name = $name")
    }

    static List findShopById(String id){
        return meiji_shop.rows("select * from shop where id = $id")
    }

    static  List findShopBusinessInfo(String shop_id){
        return meiji_shop.rows("select * from shop_business_info where shop_id = $shop_id")
    }

    static List asset(String shop_id){
        return meiji_settlement.rows("select sum(seller_profit_sharing_price) as TotalPrice from settlement_order where settlement_state =0 and shop_id = $shop_id")
    }

    static Map profitSharing(String shop_id,String orderNo){
        return meiji_settlement.firstRow("SELECT * from settlement_order where shop_id =$shop_id and trade_order_no = $orderNo")
    }

    static List findUserInfo(String id){
        return meiji_user.rows("SELECT * FROM user WHERE is_delete !=1 AND source_type = 0 AND id=$id")
    }

    static Map findUserAddressList(String user_id){
        return meiji_user.firstRow("select * from user_address where user_id = $user_id and is_delete = 0 order by gmt_create limit 1")
    }

    static Map GetGiftInfo(String gift_id){
        return meiji_active.rows("SELECT * FROM gift_goods  WHERE gift_id = '1453960321826848' AND is_delete =0 ORDER BY sort ASC").get(0)
    }

    static List searchRaffledRecord(){
        return meiji_active.rows("SELECT * FROM raffle_accept_record ORDER BY gmt_create desc")
    }

    static List itemDetail(String id){
        return meiji_active.rows("SELECT * FROM raffle_item WHERE id= $id ")
    }

    static List order_info(String orderCode){
        return meiji_order.rows("select * from order_info where order_code = $orderCode")
    }

    static List getOrderLogisticsInfo(String orderCode){
        return meiji_order.rows("select * from order_logistic where order_code = $orderCode")
    }

    static  List getUserOrderCount_toAfterCount(String ShopId){
        return meiji_order.rows("select count(*) as AfterCount from order_after where shop_id = $ShopId and op_user_type <> 2")
    }

    static List getUserOrderCount_toConfirmCount(String ShopId){
        return meiji_order.rows("select count(*) as confirmCount from order_info where shop_id = $ShopId and order_status = 5 and order_type !=4")
    }

    static List getUserOrderCount_toDeliveryCount(String ShopId){
        return meiji_order.rows("select count(*) as DeliveryCount from order_info where receiver_tel = 19928717417 and order_status in(2,3,4) and order_type <> 4")
    }

    static List getUserOrderCount_toPayCount(String ShopId){
        return meiji_order.rows("select count(*) as PayCount from order_info where shop_id = $ShopId and order_status =1")
    }

    static List pageOrder(String shopId){
        return meiji_order.rows("select * from order_info where shop_id = $shopId and order_type <> 4 ORDER BY gmt_create DESC limit 10")
    }

    static  List updateUserAddress(String id){
        return meiji_user.rows("select * from user_address where id = $id")
    }

    static  Map getUserAddress(String id){
        return meiji_user.firstRow("select * from user_address where id = $id")
    }

    static Map getUserInfo(String UserId){
        return meiji_user.firstRow("select * from user where id =$UserId")
    }

    static Map findUserAddressInfo(){
        return meiji_user.rows("SELECT * FROM `meiji_user`.`user_address` WHERE `user_id` = '1231' LIMIT 1000").get(0)
    }

    static Map findUserIntegralInfo(){
        return meiji_integral.rows("SELECT * FROM user_integral_change_log WHERE nickname ='Tony Yan' AND task_type IN(1,2,3,4,5,6,7,8,9,10,11,12) ORDER BY do_task_time DESC").get(0)
    }

    static Map detailTask(String id){
        return meiji_integral.firstRow("SELECT * FROM `integral_task` WHERE `id` = $id LIMIT 0,1000")
    }

    static Map getIntegralList(){
        return meiji_integral.rows("SELECT * FROM `user_integral_change_log` WHERE `nickname` ='Tony Yan' ORDER BY do_task_time DESC LIMIT 0,1000").get(0)
    }

    static Map findUserOrderInfo(){
        return meiji_order.rows("SELECT * FROM order_info WHERE buyer_id= 1231 AND order_status != 9 ORDER BY gmt_create DESC").get(0)
    }

    static List personalIntegralQuery(String userId){
        return meiji_integral.rows("SELECT * FROM user_integral_info WHERE user_id=$userId")
    }

    static List userTaskInfoQuery(String userId){
        return meiji_integral.rows("SELECT * FROM user_task_info WHERE user_id =$userId AND task_type IN(2) ORDER BY  gmt_create DESC")
    }

    static List pageQuery(String userId){
        return meiji_integral.rows("SELECT * FROM user_integral_change_log WHERE user_id =$userId ORDER BY do_task_time DESC")
    }

    static List UserIntegralCouponByPage(String activeId,String couponId ){
        return meiji_integral.rows("SELECT * FROM `user_integral_coupon_log` WHERE active_id = $activeId AND coupon_id = $couponId  ORDER BY gmt_create DESC")
    }

    static List UserIntegralByPage(){
        return meiji_integral.rows("SELECT * FROM user_integral_info ORDER BY gmt_create DESC")
    }

    static List GetPlatformIntegralByPage(){
        return meiji_integral.rows("SELECT * FROM `user_integral_change_log` WHERE user_id =99999 AND nickname = \"平台\" ORDER BY do_task_time DESC")
    }

    static List PlatformIntegralQuery(){
        return meiji_integral.rows("SELECT * FROM `user_integral_info` WHERE `user_id` = '99999' LIMIT 0,1000")
    }

    static List<Map> getUnSettleOrder(){
        return meiji_settlement.rows("select shop_name,trade_parent_order_no from settlement_order where settlement_state not in(2,3) and gmt_create < date_sub(now(),interval 7 Day) order by gmt_create desc")
    }

    static List<Map> getOrderByParentOrderNo(String parentOrderNo){
        return meiji_settlement.rows("select trade_order_no,gmt_create,state,settlement_state from settlement_order where trade_parent_order_no = $parentOrderNo")
    }

    static List getOrderLogistic(String orderNo){
        return meiji_order.rows("select logistics_code,gmt_create,logistics_company_code from order_logistic where order_code = $orderNo")
    }

    static Map getAfterOrderLog(String afterCode,Integer step){
        return meiji_order.firstRow("select * from order_after_log where order_after_code = $afterCode and step = $step")
    }

    static List<Map> getOrderInfoPaidAmount(String flowOrderNo){
        return meiji_order.rows("select * from meiji_order.order_info where order_code = $flowOrderNo")
    }

    static List<Map> getOrderAfterRefundAmount(String flowOrderNo){
        return meiji_order.rows("SELECT * from meiji_order.order_after where after_status =6 and  order_code = $flowOrderNo")
    }

    static List getAfterOrder(String orderId){
        return meiji_order.rows("select after_code,after_status,after_type,gmt_create from order_after where order_code = $orderId")
    }

    static List getShops(){
        List list = meiji_shop.rows("select id,shop_name from shop where auth_state = 40 and audit_state = 20 and state = 1 order by gmt_create desc limit 50")
        return list
    }

    static Integer getInviteCodeNum(Long shopId){
        Map map = meiji_shop.firstRow("select  count(*) as cnt from invite_code where shop_id = $shopId")
        return map.cnt
    }

    static List getOrderInfoStatus(){
        return meiji_order.rows("SELECT order_code, parent_order_code,order_status, order_type,gmt_create from order_info where pay_status !=0 and order_type !=3 and order_type !=5 and gmt_create> DATE_SUB(NOW(),INTERVAL 1 DAY)")
    }

    static Map getSettlementOrderStatusByOrderNo(String orderNo){
        return meiji_settlement.firstRow("SELECT trade_order_no, trade_parent_order_no,state,gmt_create from settlement_order where trade_order_no = $orderNo")
    }

    static  List<Map> getSettlementFlow(String parentOrderNo){
        return meiji_settlement.rows("select * from meiji_settlement.settlement_flow where trade_parent_order_no = $parentOrderNo order by trade_type")
    }

    static List<Map> getSettlementOrder(){
        return meiji_settlement.rows("SELECT\n" +
                "\t* \n" +
                "FROM\n" +
                "\tmeiji_settlement.settlement_order \n" +
                "WHERE\n" +
                "\tstate = 7 \n" +
                "\tAND settlement_state = 2 \n" +
                "\tAND supplier_settlement_state = 2 \n" +
                "\tAND order_type = 1\n" +
                "\tand settlement_finish_time > DATE_SUB(CURDATE(), INTERVAL 3 MONTH)")
    }

    static List<Map> getSettlementOrderItem(String orderNo){
        return meiji_settlement.rows("SELECT * from meiji_settlement.settlement_order_item where state =1 and trade_order_no =$orderNo")
    }

    static  Map getGoods_brand(){
        return meiji_goods.firstRow("SELECT * from goods_brand ORDER BY gmt_create DESC LIMIT 20")
    }

    static Map getOrderByPage(){
        return meiji_order.rows("SELECT * from order_info ORDER BY gmt_create DESC limit 20")
    }

    static Map batchUpdateConfig(){
        return meiji_goods.firstRow("SELECT * from meiji_system.config_log where `key` like 'lockingPeriod' ORDER BY update_time desc;")
    }

    static  Map findShopByUserId(){
        return meiji_shop.firstRow("SELECT * from shop where id=1405981112139808")
    }

    static Map flowPageQuery(){
        return meiji_pay.firstRow("SELECT * from trade_flow where merchant_type =1 and entity_id = 1405981112139808 and `year` = 2021 and `month` =7 and trade_type = 4")
    }

    static List findInviteCodeList(String shopId,String state){
        String sql = ""
        if(StringUtils.isBlank(state)||state=="null"){
            sql = "SELECT * from invite_code where shop_id = $shopId and state in (0,1) ORDER BY state,id asc LIMIT 10"
        }else{
            sql = "SELECT * from invite_code where shop_id = $shopId and state = $state ORDER BY id asc LIMIT 10"
        }
        return meiji_shop.rows(sql)
    }

    static List getShopAccountData(){
        return meiji_settlement.rows("select shop_code,shop_name from settlement_order where gmt_modified > date_sub(now(),interval 3 Day) group by shop_code")
    }

    static List getSupplierAccountData(){
        return meiji_settlement.rows("select supplier_code,supplier_name from settlement_order where gmt_modified > date_sub(now(),interval 3 Day) group by supplier_code")
    }

    static List getDecorateTemplateDetail(){
        return meiji_shop.rows("SELECT id from shop_decorate_template where status = 1 and is_default = 1 and is_delete = 0")
    }

    static List getOneCategory(){
        return meiji_goods.firstRow(sql:"SELECT id from goods_category where show_status = 0 and `status`= 1 and type=1 and parent_id = 0")
    }

    static Map purchaseManageList(String email){
        return meiji_goods.firstRow("SELECT id from meiji_goods.goods_supervisor where email =$email and update_by = '自动化测试' ORDER BY gmt_modified desc LIMIT 10")
    }

    static Map brandQueryPage(){
        return meiji_goods.firstRow("SELECT count(*) as total from meiji_goods.goods_brand ")
    }

    static Map brandQueryPage1(){
        return meiji_goods.rows("SELECT * from meiji_goods.goods_brand ORDER BY gmt_modified DESC LIMIT 20")
    }

    static boolean deleteBrand(String name){
        return meiji_goods.execute("DELETE from meiji_goods.goods_brand WHERE name = $name")
    }

    static Map updateBrand(String id){
        return meiji_goods.firstRow("select * from meiji_goods.goods_brand where id = $id")
    }

    static boolean deleteCategory(String name){
        return meiji_goods.execute("delete from meiji_goods.goods_category where name =$name ORDER BY gmt_create desc")
    }

    static boolean deleteLabel(String labelName){
        return meiji_goods.execute("delete from meiji_goods.goods_label where label_name = $labelName")
    }

    static Map deleteLabel1(){
        return meiji_goods.firstRow('select id  from meiji_goods.goods_label where label_name = "接口测试" ORDER BY gmt_create desc')
    }

    static boolean deleteGoodsProperty(String name){
        return meiji_goods.execute("delete from meiji_goods.goods_property where name = $name")
    }

    static boolean deleteGoodsPropertyGroup(String name){
        return meiji_goods.execute("delete from meiji_goods.goods_property_group where name = $name")
    }

    static boolean submitGoods(String id){
        return  meiji_goods.execute("UPDATE meiji_goods.goods_spu set status = 0 where id = $id")
    }

    static boolean auditGoods(String spuId){
        return meiji_goods.execute("UPDATE meiji_goods.goods_spu set status = 1 where id=$spuId")
    }

    static boolean batchDelete(String spuId){
        return meiji_goods.execute("UPDATE meiji_goods.goods_spu set status = 3 where id=$spuId")
    }

    static boolean batchrealDelete(String spuId){
        return meiji_goods.execute("UPDATE meiji_goods.goods_spu set is_delete = 0 where id=$spuId")
    }

    static boolean batechRec(String spuId){
        return meiji_goods.execute("UPDATE meiji_goods.goods_spu set status = 5,is_delete = 0 where id=$spuId")
    }

    static boolean publishBack(String spuId){
        return meiji_goods.execute("UPDATE meiji_goods.goods_spu set status = 3,is_delete = 0 where id=$spuId")
    }

    static  List queryAllotBillDetail(String adjustId){
        return meiji_stock.rows("SELECT * FROM meiji_stock.stock_adjust_sku WHERE adjust_id=$adjustId")
    }

    static List pageQueryAllotBill(){
        return meiji_stock.rows("SELECT * FROM meiji_stock.stock_adjust ORDER BY gmt_create DESC")
    }

    static  boolean deleteChannel(String name){
        return meiji_goods.execute("delete from meiji_goods.channel where name = $name")
    }

    static boolean deleteChannelColumn(String name){
        return meiji_goods.execute("delete from meiji_goods.channel_column where name = $name")
    }

    static def getNewestID(){
        Map map= meiji_active.firstRow("SELECT id FROM `meiji_active`.`active_main` WHERE `type` = '11' AND `status` in(1,2) AND `is_delete` <> '1' ORDER BY gmt_create DESC")
        if(map == null){
            println("暂无秒杀活动数据")
            throw new SkipException("暂无秒杀活动数据")
        }
        return map.id
    }

    static def getActiveList(Integer type){
        return meiji_active.firstRow("SELECT * from meiji_active.active_main where type = $type ORDER BY gmt_modified DESC limit 20")
    }

    static def setNewActiveStatus(String status){
        if(status =="2"){
            meiji_active.execute("UPDATE meiji_active.active_main set status = 1 where type = 11 and create_by ='ifat' ORDER BY gmt_create")
        }else if(status == "3"){
            meiji_active.execute("UPDATE meiji_active.active_main set status = 2 where type = 11 and create_by ='ifat' ORDER BY gmt_create")
        }else if(status == "4"){
        meiji_active.execute("UPDATE meiji_active.active_main set status = 3 where type = 11 and create_by ='ifat' ORDER BY gmt_create")
    }
        Map map =  meiji_active.firstRow("SELECT id from meiji_active.active_main where type = 11 and create_by ='ifat' ORDER BY gmt_create")
        return map.id
    }

    static def raffleActiveStatus(String status){
        if (status == "2"){
            meiji_active.execute("UPDATE meiji_active.active_main SET status = 1 WHERE type = 8 AND create_by ='ifat'")
        }else if(status == "3"){
            meiji_active.execute("UPDATE meiji_active.active_main SET status = 2 WHERE type = 8 AND create_by ='ifat'")
        }else if(status == "4"){
            meiji_active.execute("UPDATE meiji_active.active_main SET status = 3 WHERE type = 8 AND create_by ='ifat'")
        }
        Map map = meiji_active.firstRow("SELECT id from meiji_active.active_main where type = 8 and create_by ='ifat' ORDER BY gmt_create DESC")
        return map.id
    }

    static def getRaffleActiveID(){
        Map map = meiji_active.firstRow("SELECT id FROM meiji_active.active_main WHERE type = 8 AND status IN (1,2,3,4) and create_by ='ifat' ORDER BY gmt_create DESC")
        return map.id
    }

    static def getSaveSourceRaffleID(){
        ArrayList<Map> map= meiji_active.rows("SELECT id FROM meiji_active.active_main WHERE type = 8 AND status IN (3,4)ORDER BY gmt_create DESC")
        println(map)
        return map.id
    }


    static def auditGoodsID(){
        ArrayList<Map>  map = meiji_content.rows("SELECT goods_id AS id FROM `meiji_content`.`live_goods` WHERE `audit_status` = '3' ORDER BY gmt_create DESC ")
        println(map)
        return map.id
    }

    static def auditGoodsID1(){
        ArrayList<Map>  map = meiji_content.rows("SELECT goods_id AS goodsId FROM `meiji_content`.`live_goods` WHERE `audit_status` = '2' ORDER BY gmt_create DESC ")
        println(map)
        return map.goodsId
    }

    static def auditGoodsID2(){
        ArrayList<Map>  map = meiji_content.rows("SELECT price_type AS priceType FROM `meiji_content`.`live_goods` WHERE `audit_status` = '2' ORDER BY gmt_create DESC ")
        println(map)
        return map.priceType
    }

    static def auditGoodsID3(){
        ArrayList<Map>  map = meiji_content.rows("SELECT price AS price FROM `meiji_content`.`live_goods` WHERE `audit_status` = '2' ORDER BY gmt_create DESC ")
        println(map)
        return map.price
    }

    static def liveID(){
        Map  map = meiji_content.firstRow("SELECT id FROM `meiji_content`.`live` WHERE `is_delete` = '0' AND `live_status` IN(103,107) ORDER BY start_time DESC")
        println(map)
        return map.id
    }
    static def checkSpusIsOnlyGift(){
        Map map = meiji_goods.firstRow("SELECT id FROM `meiji_goods`.`goods_spu` WHERE `status` = '4' AND `is_delete` = '0'  ORDER BY publish_time DESC")
        println(map.id)
        if(map==null){
            println("暂无已发布的商品")
            throw new SkipException("暂无已发布的商品")
        }
        return map.id
    }

    static def isShowGetCoupon(String spuId){
        Map map =meiji_goods.firstRow("SELECT id FROM `meiji_goods`.`goods_sku` WHERE `spu_id` =$spuId")
        if(map==null){
            println("暂无已发布的商品")
            throw new SkipException("暂无已发布的商品")
        }
        println(map.id)
        return map.id
    }

    static def integralConvert1(){
        Map map =meiji_integral.firstRow("SELECT id FROM `meiji-integral`.`integral_active` WHERE `status` = '4' AND `is_delete` = '0'")
        println(map)
        return map.id
    }
    static def integralConvert2(){
        List list =meiji_integral.rows("SELECT * FROM `meiji-integral`.`coupon_integral_rule` WHERE `active_id` IN(SELECT id FROM `meiji-integral`.`integral_active` WHERE `status` = '4' AND `is_delete` = '0' )")
        println(list)
        return list
    }

    static def integralConvert3(){
        List list =meiji_integral.rows("SELECT * FROM `meiji-integral`.`coupon_integral_rule` WHERE `active_id` IN(SELECT id FROM `meiji-integral`.`integral_active` WHERE `status` = '4' AND `is_delete` = '0' )")
        println(list)
        return list
    }

    static def grantCouponActiveID(String status){
        if(status =="2"){
            meiji_integral.execute("UPDATE `meiji-integral`.`integral_active`  set status = 1 where type = 1 and create_by ='ifat' ORDER BY gmt_create")
        }
        else if(status == "3"){
            meiji_integral.execute("UPDATE `meiji-integral`.`integral_active`  set status = 2 where type = 1 and create_by ='ifat' ORDER BY gmt_create")
        }
        else if(status == "4"){
            meiji_integral.execute("UPDATE `meiji-integral`.`integral_active`  set status = 3 where type = 1 and create_by ='ifat' ORDER BY gmt_create")
        }
        Map map = meiji_integral.firstRow("SELECT id from `meiji-integral`.`integral_active`   where type = 1 and create_by ='ifat' and is_delete =0 ORDER BY gmt_create DESC")
       if(map==null){
           throw new SkipException ("参数id为空")
//           println "参数id为空"
       }
        return map.id
    }

    static def sendIntegralTaskId1(){
      Map map =meiji_integral.firstRow("SELECT id FROM `meiji-integral`.`integral_task` WHERE `task_status` = '1' AND `task_limit_times` = '0' AND `task_type` <> '7' ")
        if(map == null){
            println "积分中心暂无非签到任务"
            return null
        }
        return map.id
    }

    static def sendIntegralTaskId2(){
        Map map =meiji_integral.firstRow("SELECT task_type FROM `meiji-integral`.`integral_task` WHERE `task_status` = '1' AND `task_limit_times` = '0' AND `task_type` <> '7' ")
        println map.get("task_type")
        if((map.get("task_type"))==null){
            println "积分中心暂无非签到任务"
            return null
        }
        return map.get("task_type")
    }



    static def GetSeckillActiveFromDecorate(){
        Map map = meiji_shop.firstRow("SELECT ext from meiji_shop.shop_decorate_template_component where component_type =117 and template_id in (SELECT id from meiji_shop.shop_decorate_template where is_default = 1 and status =1 and template_name like '美记小程序')")
        if (JsonUtil.strToJson(map.get("ext")).getAt("couponActiveId") == []){
            println "装修模块未创建秒杀活动或秒杀活动未开始/不在进行中"
            return null
        }
        return JsonUtil.strToJson(map.get("ext")).getAt("couponActiveId")
    }

    static def GetSeckillActive(){
        ArrayList<Map> map = meiji_shop.rows("SELECT id from meiji_active.active_main where type = 11 and is_delete =0 and `status` in (3,4) ORDER BY gmt_modified desc;")
        println map.id
        return map.id
    }

    static def CategoryDetail(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_category` ORDER BY sort ASC")
        println(list.id)
        if(list == []){
            println("暂无分类数据")
            throw new SkipException("暂无分类数据")
            return null
        }
        return list.id
    }

    static def adjustCategory(){
        ArrayList<List> list =meiji_active.rows("SELECT * FROM `meiji_active`.`gift_category` WHERE `status` = '1'  ORDER BY sort ASC")
        println(list.id)
            if(list == []){
                println("暂无分类数据，无法获取ID！")
                throw new SkipException("暂无分类数据，无法获取ID！")
                return null
        }
        return list.id
    }

    static def adjustCourse(){
        ArrayList<List> list =meiji_active.rows("SELECT * FOM `meiji_active`.`gift_tutorial` WHERE `status` = '0'ORDER BY sort ASC")
        println(list.id)
        if(list == []){
            println("暂无送礼教程数据，无法获取ID！")
            throw new SkipException("暂无送礼教程数据，无法获取ID！")
            return null
        }
        return list.id
    }

    static def adjustCourse01(){
        ArrayList<List> list =meiji_active.rows("SELECT * FROM `meiji_active`.`gift_tutorial` WHERE `status` = '1'ORDER BY sort ASC")
        println(list.id)
        if(list == []){
            println("暂无送礼教程数据，无法获取ID！")
            throw new SkipException("暂无送礼教程数据，无法获取ID！")
            return null
        }
        return list.id
    }


    static def adjustCategory01(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_category` WHERE `status` = '0'  ORDER BY sort ASC")
        println(list.id)
            if(list == []){
            println("暂无分类数据，无法获取ID！")
            return null
        }
        return list.id
    }

    static def editCourse(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_tutorial` WHERE `status` = '0'   ORDER BY sort ASC")
        println(list.id)
        if(list == []){
            print("暂无送礼教程数据，无法获取ID！")
            return null
        }
        return list.id
    }

    static def editCourse01(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_tutorial` WHERE `status` = '0'   ORDER BY sort ASC")
        println(list.sort)
        if(list == []){
            print("暂无送礼教程数据，无法获取！")
            return null
        }
        return list.sort
    }

    static def editCourse02(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_tutorial` WHERE `status` = '0'   ORDER BY sort ASC")
        println(list.pic)
        if(list == []){
            print("暂无送礼教程数据，无法获取！")
            return null
        }
        return list.pic
    }

    static def combinationDetail(){
        Map map =meiji_active.firstRow("SELECT id FROM `meiji_active`.`gift_goods_group` ORDER BY gmt_create DESC")
        if(map == null){
            println("暂无组合商品数据！")
            throw new SkipException("暂无组合商品数据！")
            return null
        }
        return map.id
    }

    static def adjustCombination(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_goods_group`  WHERE `status` = '0' ORDER BY gmt_create DESC")
        println(list.id)
        if(list == []){
            println("暂无组合商品数据！")
            return null
        }
        return list.id
    }

    static def adjustCombination01(){
        ArrayList<List> list = meiji_active.rows("SELECT * FROM `meiji_active`.`gift_goods_group`  WHERE `status` = '1' ORDER BY gmt_create DESC")
        println(list.id)
        if(list == []){
            println("暂无组合商品数据！")
            return null
        }
        return list.id
    }

    static def deleteLabelTree(){
        ArrayList<List> list = meiji_active.rows("SELECT id FROM `meiji_active`.`gift_label` WHERE `parent_id` = '0' AND `create_by` = '自动化测试' ORDER BY sort DESC")
        println(list.id)
        if(list == []){
            println("暂无标签数据！")
            throw new SkipException("暂无标签数据！")
            return null
        }
        return list.id
    }

    static def marketAccountDelete(){
        Map map = meiji_pay.firstRow("SELECT id FROM meiji_pay.market_account ORDER BY gmt_create desc;")
        println map.id
        return map.id
    }

    static def searchBuyerShow(){
        Map map = meiji_goods.firstRow("SELECT id FROM `meiji_goods`.`channel_column` WHERE `is_default` = '1' ")
        println(map.id)
        if(map == null){
            throw new SkipException("暂无默认分类数据")
            return null
        }
        return map.id
    }

    static def transferColumn(){
        ArrayList<List> list =meiji_content.rows("SELECT * FROM `meiji_content`.`buyer_show` WHERE  `is_delete` = '0' AND `business_type` IN (0,1) AND `show_source` = '1' ORDER BY 'gmt_create' DESC")
        println(list.id)
        if(list==[]){
            print("暂无晒单数据")
            throw new SkipException("暂无晒单数据")
            return null
        }
        return list.id
    }

    static def getSpuGifts(){
        ArrayList<List> list =meiji_goods.rows(" SELECT * FROM `meiji_goods`.`goods_spu` WHERE `status` = '4' AND `is_delete` <> '1' ORDER BY gmt_create DESC")
        println(list.id)
        if(list==[]){
            println("暂无商品数据")
            throw new SkipException("暂无商品数据")
            return null
        }
        return list.id
    }

    static def logBuyerShowTrace(String userId){
        ArrayList<List> list =meiji_content.rows(" SELECT * FROM `meiji_content`.`buyer_show_trace` WHERE `user_id` ='$userId' AND `trace_type` = '1'ORDER BY gmt_create DESC")
        println(list.show_id)
    }

    static def deleteBuyerShow(){
        ArrayList<List> list = meiji_content.rows("SELECT * FROM `meiji_content`.`buyer_show` WHERE `spu_name` LIKE '%自动化测试商品%' AND `is_delete` = '0' AND `business_type` IN (0,1)AND `show_source` = '1' ORDER BY 'gmt_create' DESC")
        println(list.id)
        if(list==[]){
            print("暂无晒单数据")
            throw new SkipException("暂无晒单数据")
            return null
        }
        return list.id
    }

    static def auditData(){
        List<Map> list = meiji_content.rows("SELECT id,business_type,publish_date FROM `meiji_content`.`buyer_show` WHERE `audit_status` <> '2' AND `is_delete` = '0'  AND `publish_date` IS NOT NULL ORDER BY 'gmt_create' DESC")
        println(list)
        if(list==[]){
            print("暂无晒单数据")
            throw new SkipException("暂无晒单数据")
            return null
        }
        return list

    }

    static def getGoodsByPage(String supplierId){
        List list = meiji_content.rows("SELECT * FROM `meiji_content`.`buyer_show` WHERE `show_source` = '3' AND `supplier_id` =$supplierId ORDER BY 'publish_date' DESC ")
        println(list)
        if(list==[]){
            print("OMS暂无溯源数据")
            throw new SkipException("OMS暂无溯源数据")
            return null
        }
        return list
    }
    static def commitTrace(){
        ArrayList<List> list = meiji_content.rows("SELECT * FROM `meiji_content`.`buyer_show` WHERE `audit_status` = '1' AND `is_delete` = '0' ORDER BY 'gmt_create' DESC")
        println(list.id)
        if(list == []){
            print("OMS暂无待提交状态溯源数据")
            throw new SkipException("OMS暂无待提交状态溯源数据")
            return null
        }
        return list.id
    }

    static def marketAccountIsDelete(){
        Map map = meiji_pay.firstRow("select is_delete from meiji_pay.market_account ORDER BY gmt_create desc;")
        return map.is_delete
    }

    static boolean marketAccountRealDelete(Long id){
        return meiji_pay.execute("delete from meiji_pay.market_account where id = $id")
    }

    static boolean marketAccountRealDelete1(String accountName){
        return meiji_pay.execute("delete from meiji_pay.market_account where account_name = $accountName")
    }

    static def marketAccountSearch(){
        return meiji_pay.firstRow("select * from meiji_pay.market_account ORDER BY gmt_create desc")
    }

    static ArrayList giftAdvManageList(){
        return meiji_active.rows("SELECT * from meiji_active.gift_advertising_bit")
    }

    static ArrayList giftAdvManageLocation(Integer location){
        return meiji_active.rows("SELECT * from meiji_active.gift_advertising_bit where location =$location")
    }

    static boolean setToggleStatus(Integer id){
        return  meiji_active.execute("UPDATE meiji_active.gift_advertising_bit SET status=0 where id=$id")
    }

    static Integer getToggleStatus(Integer id){
        Map map = meiji_active.firstRow("SELECT status from meiji_active.gift_advertising_bit where id=$id")
        return map.get("status")
    }
    static Map getGoods_spu(String spuId){
        return meiji_goods.firstRow("SELECT * from meiji_goods.goods_spu where id = $spuId")
    }

    static Integer getSupplierId(String supplierName){
        Map map = meiji_supplier.firstRow("SELECT * from meiji_supplier.meiji_supplier where name = $supplierName")
        return map.id
    }

    static Map getShipperAddress(Integer supplierID){
        return meiji_supplier.firstRow("SELECT * from meiji_supplier.supplier_shipper_address where is_default = 1 and supplier_id = $supplierID")
    }

    static Map getLiveRoom(String goodsId){
        return meiji_content.firstRow("SELECT * from meiji_content.live_room_goods WHERE goods_id = $goodsId")
    }
    static def getSeckillTopGoods(){
       Map map =  meiji_active.firstRow("SELECT id from meiji_active.active_main where type =11 and status in (3,4) ORDER BY expiry_start desc")
        return meiji_active.firstRow("SELECT * from meiji_active.seckill_activity_subtime where activity_id =$map.id ORDER BY begin_time DESC")
//        return ("SELECT * from"+
//        "\tmeiji_active.seckill_activity_subtime"+
//        "\twhere activity_id IN"+
//        "\t(SELECT id from meiji_active.active_main where type =11 and status in (3,4) and is_delete = 0 ORDER BY expiry_start desc)"+
//        "\tAND"+
//        "\tNOW() > begin_time"+
//        "\tOR"+
//        "\tNOW() > end_time"+
//        "\tORDER BY begin_time DESC"
//        )
    }

//    static def getGroupActivityID(){
//        Map map =meiji_active.firstRow("SELECT id FROM `meiji_active`.`group_buy_activity` WHERE `placement` = '1'")
//        println(map)
//        return map.id
//    }


    static Map getOrderCntByType(String beginTime,String endTime,String type){
        return meiji_order.firstRow("select" +
                "\tcount(*) as cnt," +
                "\tifnull(sum(payable_amount),0) as amount" +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand order_status not in(8,9)" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type = $type")
    }

    static Map getNaturalOrderCnt(String beginTime,String endTime){
        return meiji_order.firstRow("select" +
                "\tcount(*) as cnt," +
                "\tifnull(sum(payable_amount),0) as amount" +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand order_status not in(8,9)" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type <>4" +
                "\tand distributor_id is null")
    }

    static Map getCPSOrderCnt(String beginTime,String endTime){
        return meiji_order.firstRow("select" +
                "\tcount(*) as cnt," +
                "\tifnull(sum(payable_amount),0) as amount" +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand order_status not in(8,9)" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type <> 4" +
                "\tand distributor_id is not null")
    }

    static Map getUserOrderCnt(String beginTime,String endTime){
        return meiji_order.firstRow("select count(*) as cnt from (" +
                "select" +
                "\tbuyer_id" +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand order_status not in(8,9)" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type <>4" +
                "\tgroup by buyer_id" +
                ")t")
    }

    static Map getRepeatUserOrderCnt(String beginTime,String endTime){
        return meiji_order.firstRow("select count(*) as cnt from (" +
                "select" +
                "\tbuyer_id" +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand order_status not in(8,9)" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type <>4" +
                "\tgroup by buyer_id having count(buyer_id)>1" +
                ")t")
    }

    static Map getOrderShopCnt(String beginTime,String endTime){
        return meiji_order.firstRow("select count(*) as cnt from (" +
                "select" +
                "\tshop_id " +
                "\tfrom" +
                "\torder_info" +
                "\twhere" +
                "\tparent_order_code = 0" +
                "\tand gmt_create >= '$beginTime'" +
                "\tand gmt_create <= '$endTime'" +
                "\tand order_type <>4" +
                "\tgroup by shop_id" +
                ")t")
    }

    static Map getAllShopCnt(){
        return meiji_shop.firstRow("select count(*) as cnt from shop where auth_state =40 and audit_state =20")
    }

    //    static ArrayList page(){
//        return huangfeng_oils.rows("SELECT * FROM `huangfeng_oils`.`oils_use_order` WHERE `vaild_status` = '1' ORDER BY `gmt_create` DESC;")
//    }

    static def page(){
        ArrayList<List> list =huangfeng_oils.rows("SELECT * FROM `huangfeng_oils`.`oils_use_order` WHERE `vaild_status` = '1' ORDER BY `gmt_create` DESC;")
        if(list == []){
            println("暂无数据，无法获取ID！")
            throw new SkipException("暂无数据，无法获取ID！")
            return null
        }
        return list
    }

    static def list(){
        ArrayList<List> list =huangfeng_auth.rows("SELECT * FROM `huangfeng_auth`.`menu` WHERE `status` = '1' AND `is_delete` <> '1' AND `path` LIKE '%system%' AND `parent_id` <> '0' LIMIT 0,1000")
        println(list)
        if(list==[]){
            println("数据库查询为空！无法获取数据")
            throw new SkipException("数据库查询为空！无法获取数据")
            return null
        }
        return list
    }

    static  ArrayList transporterList(){
        return huangfeng_system.rows("SELECT * FROM `huangfeng_system`.`transporter` ORDER BY gmt_modified DESC")
    }
}

