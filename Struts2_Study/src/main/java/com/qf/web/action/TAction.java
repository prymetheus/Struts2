package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class TAction extends ActionSupport {
    public String hello(){
        System.out.println("第三种创建方式");
        return "success";
    }
}
