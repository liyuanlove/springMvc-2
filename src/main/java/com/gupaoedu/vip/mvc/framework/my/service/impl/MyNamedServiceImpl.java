package com.gupaoedu.vip.mvc.framework.my.service.impl;

import com.gupaoedu.vip.mvc.framework.annotation.GPAutowired;
import com.gupaoedu.vip.mvc.framework.my.framework.annotation.MyService;
import com.gupaoedu.vip.mvc.framework.my.service.IService;
import com.gupaoedu.vip.mvc.framework.my.service.MynamedService;

@MyService("myNamedService")
public class MyNamedServiceImpl implements MynamedService {

    @GPAutowired
    IService service;
}
