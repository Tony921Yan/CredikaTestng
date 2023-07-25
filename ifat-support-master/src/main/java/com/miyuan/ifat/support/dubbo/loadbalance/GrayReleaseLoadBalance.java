package com.miyuan.ifat.support.dubbo.loadbalance;

import io.prometheus.client.Counter;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;

import java.util.*;

/**
 * @author Xu Hongshi
 * <p>
 * 灰度发布负载均衡
 */
public class GrayReleaseLoadBalance extends AbstractLoadBalance {

    public static final String NAME = "grayrelease";
    public static final String TRUE = "true";

    private AbstractLoadBalance loadBalance = new RoundRobinLoadBalance();


    private static String application = null;
    private static final Counter GRAY_RELEASE_COUNTER =
            Counter.build().name("biz_gray_release_counter").labelNames("application", "service", "method", "providerIp", "grayReleaseTag").help("GrayRelease Counter").register();

    public GrayReleaseLoadBalance() {
    }

    /**
     * AbstractLoadBalance.select方法里面，如果只有一个提供者则直接返回，此处需要重写以区分灰度
     *
     * @param invokers
     * @param url
     * @param invocation
     * @param <T>
     * @return
     * @see AbstractLoadBalance
     */
    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        if (invokers == null || invokers.isEmpty()) {
            return null;
        }
        return doSelect(invokers, url, invocation);
    }

    /**
     * @param invokers
     * @param url
     * @param invocation
     * @param <T>
     * @return
     */
    @Override
    protected <T> Invoker<T> doSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        if (invokers != null) {
            Map<String, List<Invoker<T>>> grayReleaseInvokerMap = new HashMap<>();
            List<Invoker<T>> normalInvokers = new ArrayList<>();
            Iterator<Invoker<T>> iterator = invokers.iterator();

            while (iterator.hasNext()) {
                Invoker<T> invoker = iterator.next();
                String grayReleaseTag = invoker.getUrl().getParameter("grayReleaseTag", "");
                // 区分正常提供者和灰度提供者
                if (StringUtils.isNotBlank(grayReleaseTag)) {
                    if (grayReleaseInvokerMap.containsKey(grayReleaseTag)) {
                        grayReleaseInvokerMap.get(grayReleaseTag).add(invoker);
                    } else {
                        List<Invoker<T>> grayReleaseInvokers = new ArrayList<>();
                        grayReleaseInvokers.add(invoker);
                        grayReleaseInvokerMap.put(grayReleaseTag, grayReleaseInvokers);
                    }
                } else {
                    normalInvokers.add(invoker);
                }
            }
        }
        return null;
    }


    /**
     * 负载均衡策略
     *
     * @param invokers
     * @param url
     * @param invocation
     * @param <T>
     * @return
     */
    private <T> Invoker<T> doLoadBalanceSelect(List<Invoker<T>> invokers, URL url, Invocation invocation) {
        return loadBalance.select(invokers, url, invocation);
    }

    private <T> void recordGrayReleaseMetric(Invoker<T> invoker, Invocation invocation, String grayReleaseTag) {
        if (application == null) {
            application = "test";
        }
        String serviceFullPath = invoker.getUrl().getPath();
        String service = serviceFullPath.substring(serviceFullPath.lastIndexOf(".") + 1);
        String method = invocation.getMethodName();
        String providerIp = invoker.getUrl().getIp();
        GRAY_RELEASE_COUNTER.labels(application, service, method, providerIp, grayReleaseTag).inc();
    }
}