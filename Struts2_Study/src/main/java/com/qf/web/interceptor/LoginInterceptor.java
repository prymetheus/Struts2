package com.qf.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qf.web.action.LoginAction;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("未登录拦截正在验证........");
        Object action = actionInvocation.getAction();
        if (action instanceof LoginAction) {
            LoginAction action1 = (LoginAction) action;
            HttpServletRequest request = ServletActionContext.getRequest();
            HttpSession session = request.getSession();

            if (session.getAttribute("user") != null) {
                System.out.println("已经登录");
                return actionInvocation.invoke();
            } else if (actionInvocation.getAction() instanceof LoginAction) {

                return actionInvocation.invoke();

            } else {
                return "login";
            }
        }
        return actionInvocation.invoke();
    }
}
