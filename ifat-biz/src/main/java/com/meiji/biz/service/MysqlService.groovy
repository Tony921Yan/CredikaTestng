package com.meiji.biz.service


import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.factory.FactorySupport
import groovy.sql.Sql
import org.apache.commons.lang3.StringUtils

import java.util.stream.Collectors

class MysqlService extends MysqlAPI {

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
        return meiji_user.rows("SELECT*FROM user WHERE is_delete !=1 AND source_type = 0 AND id=$id")
    }

    static List findUserAddressList(String user_id){
        return meiji_user.rows("select * from user_address where user_id = $user_id and is_delete = 0 order by gmt_create limit 1")
    }

    static Map GetGiftInfo(String gift_id){
        return meiji_active.rows("SELECT * FROM gift_goods  WHERE gift_id = '1453960321826848' AND is_delete =0 ORDER BY sort ASC").get(0)
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
        return meiji_order.rows("SELECT order_code, parent_order_code,order_status, order_type,gmt_create from order_info where pay_status !=0 and order_type !=3 and gmt_create> DATE_SUB(NOW(),INTERVAL 1 DAY)")
    }

    static Map getSettlementOrderStatusByOrderNo(String orderNo){
        return meiji_settlement.firstRow("SELECT trade_order_no, trade_parent_order_no,state,gmt_create from settlement_order where trade_order_no = $orderNo ")
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

    static Map getChannel(){
        return meiji_goods.firstRow("SELECT * from channel ORDER BY gmt_create DESC")
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
}

