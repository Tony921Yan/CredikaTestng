package com.meiji.debug


import com.miyuan.service.OrderService
import org.testng.annotations.Test

class RabbitMqDebug {
    @Test
    void test(){
        OrderService.sendOrderMessage("TB",
                UUID.randomUUID().toString(),
                new Date(),
                new Date(),
                1,
                111111,
                1,
                new Date(),
                1,
                new Date(),
                "111111")
    }
}
