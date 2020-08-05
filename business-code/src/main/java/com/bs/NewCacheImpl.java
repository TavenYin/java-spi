package com.bs;

import com.github.tavenyin.spi.Cache;

public class NewCacheImpl implements Cache {
    @Override
    public String getName() {
        return "newImpl";
    }
}
