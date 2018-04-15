package com.gupaoedu.vip.mvc.framework.my.framework;

import com.gupaoedu.vip.mvc.framework.annotation.GPRequestMapping;
import com.gupaoedu.vip.mvc.framework.annotation.GPRequestParam;
import com.gupaoedu.vip.mvc.framework.my.Servlet.MyModelAndView;
import com.gupaoedu.vip.mvc.framework.my.framework.annotation.MyAutowired;
import com.gupaoedu.vip.mvc.framework.my.framework.annotation.MyController;
import com.gupaoedu.vip.mvc.framework.my.framework.annotation.MyRequestMapping;
import com.gupaoedu.vip.mvc.framework.my.service.IService;
import com.gupaoedu.vip.mvc.framework.my.service.MynamedService;
import com.gupaoedu.vip.mvc.framework.servlet.GPModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@MyController
@MyRequestMapping("/myweb")
public class MyAction {
    @MyAutowired
    private IService iService;
    @MyAutowired("myNamedService")
    private MynamedService mynamedService;

    @MyRequestMapping("/query/.*.do")
//	@GPResponseBody
    public MyModelAndView query(HttpServletRequest request, HttpServletResponse response,
                                @GPRequestParam(value="name",required=false) String name,
                                @GPRequestParam("addr") String addr){
        //out(response,"get params name = " + name);
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("name", name);
        model.put("addr", addr);
        return new MyModelAndView("first.pgml",model);
    }

    @MyRequestMapping("/add.do")
    public MyModelAndView add(HttpServletRequest request,HttpServletResponse response){
        out(response,"this is json string");
        return null;
    }

    public void out(HttpServletResponse response,String str){
        try {
            response.getWriter().write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
