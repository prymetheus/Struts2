package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class MyResultAction extends ActionSupport {
    public String test(){
        System.out.println("自定义结果视图类型");
        return "my";
    }

}
