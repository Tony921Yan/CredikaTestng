package com.meiji.factory

import com.meiji.util.ResourceUtil
import com.mongodb.MongoClient
import com.mongodb.MongoClientOptions
import com.mongodb.MongoCredential
import com.mongodb.ServerAddress
import com.mongodb.client.MongoDatabase
import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory
import groovy.sql.Sql
import org.apache.rocketmq.client.producer.DefaultMQProducer
import org.elasticsearch.client.transport.TransportClient
import org.elasticsearch.common.settings.Settings
import org.elasticsearch.common.transport.InetSocketTransportAddress
import org.elasticsearch.common.transport.TransportAddress
import org.elasticsearch.transport.client.PreBuiltTransportClient
import redis.clients.jedis.HostAndPort
import redis.clients.jedis.JedisCluster

class FactorySupport {
    static Map<String, Object> factory = new HashMap<String, Object>()


    static Sql createSql(String beanName){
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as Sql
        }
        Map map = ResourceUtil.getBeanData(beanName)
        String url = map.get("url")
        String user = map.get("user")
        String password = map.get("password")
        String driver = map.get("driver")
        url = url + "?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&serverTimezone=Asia/Shanghai"
        Sql sql = Sql.newInstance(url, user, password, driver)
        factory.put(beanName,sql)
        return sql
    }

    static JedisCluster createRedis(String beanName){
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as JedisCluster
        }
        Map map = ResourceUtil.getBeanData(beanName)
        String hosts = map.get("host")
        Set<HostAndPort> jedisClusterSet = new HashSet<HostAndPort>()
        List hostList = hosts.split(",")
        for(String host:hostList){
            jedisClusterSet.add(new HostAndPort(host.split(":")[0],Integer.parseInt(host.split(":")[1])))
        }
        JedisCluster jedisCluster = new JedisCluster(jedisClusterSet)
        factory.put(beanName,jedisCluster)
        return jedisCluster
    }

    static TransportClient createEs(String beanName){
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as TransportClient
        }
        Map map = ResourceUtil.getBeanData(beanName)
        Integer poolSize = Integer.parseInt(map.get("poolSize"))
        String clusterName = map.get("clusterName")
        String hostName = map.get("hostName")
        Integer port = Integer.parseInt(map.get("port"))
        Settings settings = Settings.builder()
                .put("client.transport.sniff", true)
                .put("thread_pool.search.size", poolSize)
                .put("cluster.name", clusterName)
                .build()
        TransportClient transportClient = new PreBuiltTransportClient(settings)

        String[] hostNames = hostName.split(",")
        for (String esIp : hostNames) {
            TransportAddress transportAddress =new InetSocketTransportAddress(new InetSocketAddress(
                    esIp, port))
            transportClient.addTransportAddress(transportAddress)
        }
        factory.put(beanName,transportClient)
        return transportClient
    }

    static MongoDatabase createMongoCollection(String beanName) {
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as MongoDatabase
        }
        Map map = ResourceUtil.getBeanData(beanName)
        Integer connectionsPerHost  = Integer.parseInt(map.get("connectionsPerHost"))
        Integer maxWaitTime  = Integer.parseInt(map.get("maxWaitTime"))
        Integer connectTimeout  = Integer.parseInt(map.get("connectTimeout"))
        String host = map.get("host")
        Integer port = Integer.parseInt(map.get("port"))
        String userName = map.get("userName")
        String dataBase = map.get("dataBase")
        String password = map.get("password")
        ServerAddress serverAddress = new ServerAddress(host, port)
        MongoCredential credential = MongoCredential.createCredential(userName, dataBase, password.toCharArray())
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder()
        builder.connectionsPerHost(connectionsPerHost)
        builder.maxWaitTime(maxWaitTime)
        builder.connectTimeout(connectTimeout)
        MongoClientOptions mongoClientOptions = builder.build()
        MongoClient monGoClient = new MongoClient(serverAddress, Arrays.asList(credential), mongoClientOptions)

        MongoDatabase mongoDatabase = monGoClient.getDatabase(dataBase)

        factory.put(beanName,mongoDatabase)
        return mongoDatabase
    }

    static Channel createRabbitMq(String beanName){
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as Channel
        }
        Map map = ResourceUtil.getBeanData(beanName)
        String host = map.get("host")
        String username = map.get("username")
        String password = map.get("password")
        Integer port = Integer.parseInt(map.get("port"))

        ConnectionFactory connectionFactory = new ConnectionFactory()
        connectionFactory.setHost(host)
        connectionFactory.setUsername(username)
        connectionFactory.setPassword(password)
        connectionFactory.setPort(port)
        Connection connection = connectionFactory.newConnection()
        Channel channel = connection.createChannel()
        factory.put(beanName,channel)
        return channel
    }

    static DefaultMQProducer createRocketMq(String beanName){
        if(factory.get(beanName)!=null){
            return factory.get(beanName) as DefaultMQProducer
        }
        Map map = ResourceUtil.getBeanData(beanName)
        String producerGroup = map.get("producerGroup")
        String namesrvAddr = map.get("namesrvAddr")
        Integer retryTimesWhenSendFailed = Integer.parseInt(map.get("retryTimesWhenSendFailed"))
        Integer sendMsgTimeout = Integer.parseInt(map.get("sendMsgTimeout"))

        DefaultMQProducer defaultMQProducer = new DefaultMQProducer(producerGroup)
        defaultMQProducer.setNamesrvAddr(namesrvAddr)
        defaultMQProducer.setRetryTimesWhenSendFailed(retryTimesWhenSendFailed)
        defaultMQProducer.setSendMsgTimeout(sendMsgTimeout)
        try {
            defaultMQProducer.start()
        } catch (Exception e) {
            e.printStackTrace()
        }
        factory.put(beanName,defaultMQProducer)
        return defaultMQProducer
    }
}
