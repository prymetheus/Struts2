package com.qf.web.action;

import com.opensymphony.xwork2.ModelDriven;
import com.qf.domain.User;

public class ParamAction3 implements ModelDriven<User> {
    private User user=new User();
    @Override
    public User getModel() {
        return user;
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
