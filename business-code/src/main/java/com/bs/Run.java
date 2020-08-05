package com.bs;

import com.github.tavenyin.spi.Cache;

public class Run {

    public static void main(String[] args) {
        System.out.println(Cache.load().getName());
    }

}
