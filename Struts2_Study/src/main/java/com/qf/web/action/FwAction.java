package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class FwAction extends ActionSupport {
    public String h1(){
        System.out.println("第一种访问方式,,,名称访问");
        return "success";
    }
    public String useradd(){
        System.out.println("第二种方式:*");
        return "success";
    }
    public String userSet(){
        System.out.println("第三种方式:*_*");
        return "success";
    }
}
