package com.meiji.service

import com.meiji.api.EsAPI
import org.elasticsearch.action.search.SearchResponse
import org.elasticsearch.index.query.QueryBuilders

class EsService extends EsAPI{


    static List<Map> getItemByitemTitle(String itemTitle){
        SearchResponse searchResponse = transportClient.prepareSearch("item")
                .setQuery(QueryBuilders.matchQuery("itemTitle",itemTitle))
                .setFrom(0).setSize(10).setExplain(true)
                .execute()
                .actionGet()
        List list = new ArrayList()
        searchResponse.hits.forEach { x ->
            list.add(x.getSource())
        }
        return list
    }

    static List<Map> getItemByitemSourceId(String itemSourceId){
        SearchResponse searchResponse = transportClient.prepareSearch("item")
                .setQuery(QueryBuilders.matchQuery("itemSourceId",itemSourceId))
                .setFrom(0).setSize(10).setExplain(true)
                .execute()
                .actionGet()
        List list = new ArrayList()
        searchResponse.hits.forEach { x ->
            list.add(x.getSource())
        }
        return list
    }
}
