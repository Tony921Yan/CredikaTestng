package com.miyuan.util

class RandomUtil {
    static Random random = new Random()
    static Integer getRandomInt(Integer length){
        if (length>=10){
            return 1
        }
        String str = ""
        for(int i=0;i<length;i++){
            str = str+random.nextInt(9)
        }
        return Integer.valueOf(str)
    }
}
