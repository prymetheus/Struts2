package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.qf.domain.User;

/**
 * action获取参数的第二种方式*/
public class ParamAction2 extends ActionSupport {
private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String login() {
        if (user != null) {
            System.out.println("当前登录信息:" + user.getUsername() + "------" + user.getPassword());
            if (user.getUsername() != null && user.getPassword() != null) {
                if (user.getUsername().length() > 0 && user.getPassword().length() > 0) {
                    return "success";
                }
                return "error";
            }
            return "success";
        } else {
            return "error";
        }
    }
}
