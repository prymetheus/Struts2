package com.qf.web.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("action被访问了");
        return "hello";
    }
}
