package com.qf.web.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qf.web.action.ParamAction1;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 * */
public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("自定义拦截器正在执行......................");
        /*获取行为对象*/
       /* Action action = (Action)actionInvocation.getAction();*/
        System.out.println("预处理");
       // HttpServletRequest request = ServletActionContext.getRequest();
        if (actionInvocation.getAction() instanceof ParamAction1) {
            ParamAction1 action = (ParamAction1) actionInvocation.getAction();
            System.out.println("用户名:"+action.getUsername()+".........");
            action.setUsername("拦截器");
        }
        //执行对应的方法
        String invoke = actionInvocation.invoke();
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println("后处理");

        return invoke;
    }
}
