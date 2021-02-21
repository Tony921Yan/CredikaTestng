package com.meiji.service

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.ReferenceConfig
import com.alibaba.dubbo.config.RegistryConfig
import com.alibaba.dubbo.config.utils.ReferenceConfigCache
import com.alibaba.dubbo.rpc.service.GenericService

class DubboService {
    static Object invoke(String address,String interfaceName,String methodName,String version,Integer timeOut,String[] paramTypes,Object[] params){
        // 普通编码配置方式
        ApplicationConfig application = new ApplicationConfig()
        application.setName("test")

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig()
        registry.setAddress(address)

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>()

        reference.setApplication(application)
        reference.setRegistry(registry)
        reference.setInterface(interfaceName)
        reference.setVersion(version)
        reference.setTimeout(timeOut)
        // 声明为泛化接口
        reference.setGeneric(true);

        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        GenericService genericService = cache.get(reference);

        Object result = genericService.$invoke(methodName, paramTypes,params);
        return result;
    }
}
