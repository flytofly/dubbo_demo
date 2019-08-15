package com.provider.service;

import com.api.service.DemoApi;

/**
 * @Author:wangkeke
 * @Date: 2019/8/14 0014下午 5:56
 */
public class DemoApiImpl implements DemoApi {
    @Override
    public String SayHello() {
        return "Hello World!";
    }
}
