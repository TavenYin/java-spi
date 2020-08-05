package com.github.tavenyin.spi;

import java.util.ServiceLoader;

public interface Cache {

    String getName();

    static Cache load() {
        // ServiceLoader 实现了 Iterable，可以加载到Cache接口的多个实现类
        ServiceLoader<Cache> cacheServiceLoader =  ServiceLoader.load(Cache.class);
        return cacheServiceLoader.iterator().next();
    }

}
