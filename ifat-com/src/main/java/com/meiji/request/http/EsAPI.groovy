package com.meiji.request.http

import com.meiji.factory.FactorySupport
import org.elasticsearch.client.transport.TransportClient

class EsAPI {
    @Lazy
    static TransportClient transportClient = FactorySupport.createEs("es-miyuan")
}
