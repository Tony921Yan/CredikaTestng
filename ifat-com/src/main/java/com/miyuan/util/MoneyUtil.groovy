package com.miyuan.util

import java.text.DecimalFormat

class MoneyUtil {
    /**
     * 元转分，确保price保留两位有效数字
     * @return
     */
    public static int changeY2F(double price) {
        DecimalFormat df = new DecimalFormat("#.00");
        price = Double.valueOf(df.format(price));
        int money = (int)(price * 100);
        return money;
    }

    /**
     * 元转分，确保price保留两位有效数字
     * @return
     */
    public static int changeY2F(String price) {
        BigDecimal bigDecimalPrice = new BigDecimal(price)
       // DecimalFormat df = new DecimalFormat("#.00");
       // bigDecimalPrice = df.format(bigDecimalPrice);
        int money = (int)(bigDecimalPrice * 100);
        return money;
    }

    /**
     * 分转元，转换为bigDecimal在toString
     * @return
     */
    public static String changeF2Y(int price) {
        return BigDecimal.valueOf(Long.valueOf(price)).divide(new BigDecimal(100)).toString();
    }

    /**
     * 分转元，转换为bigDecimal在toString
     * @return
     */
    public static String changeF2Y(String price) {
        return BigDecimal.valueOf(Long.valueOf(price)).divide(new BigDecimal(100)).toString();
    }


}
