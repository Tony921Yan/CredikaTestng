package com.meiji.api

import com.miyuan.factory.FactorySupport
import org.elasticsearch.client.transport.TransportClient

class EsAPI {
    @Lazy
    static TransportClient transportClient = FactorySupport.createEs("es-miyuan")
}
