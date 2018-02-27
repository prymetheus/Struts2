package com.qf.web.action;

import com.opensymphony.xwork2.Action;

public class SAction implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("第二种创建方式");
        return "success";
    }
}
