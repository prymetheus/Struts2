package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * action接受参数的第一种方式
 */
public class ParamAction1 extends ActionSupport {
    private String username;
    private String password;

    public String login() {
        System.out.println("当前登录信息:" + username + "------" + password);
        if (username!=null&&password!=null) {
            if (username.length() > 0 && password.length() > 0) {
                return "success";
            }
            return "error";
        } else {
            return "error";
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
