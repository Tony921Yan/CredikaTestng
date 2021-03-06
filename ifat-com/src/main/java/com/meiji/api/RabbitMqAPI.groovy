package com.meiji.api

import com.meiji.factory.FactorySupport
import com.rabbitmq.client.Channel

class RabbitMqAPI {
    @Lazy
    static Channel channel = FactorySupport.createRabbitMq("rabbitmq-miyuan")

    static void basicPublish(String topic,Object message){
        channel.basicPublish("",topic,null,message.toString().getBytes())
    }
}
