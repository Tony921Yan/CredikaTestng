package com.meiji.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import org.elasticsearch.client.transport.TransportClient

class EsAPI {
    @Lazy
    static TransportClient transportClient = FactorySupport.createHighLevelEs("es-miyuan")
}
