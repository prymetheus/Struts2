package com.qf.web.result;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.result.StrutsResultSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyResult extends StrutsResultSupport {
    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
        System.out.println("自定义结果视图"+s);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.sendRedirect(s);
        /*HttpServletRequest request = ServletActionContext.getRequest();
        request.getRequestDispatcher(s).forward(request,response);*/
    }
}
