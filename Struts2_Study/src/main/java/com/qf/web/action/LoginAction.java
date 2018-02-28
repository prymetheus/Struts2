package com.qf.web.action;
import com.opensymphony.xwork2.ModelDriven;
import com.qf.domain.User;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpSession;
public class LoginAction implements ModelDriven<User> {
private User user=new User();
    @Override
    public User getModel() {
        return user;
    }
    public String login(){
        System.out.println("正在登陆........");
        if (user.getPassword()!=null&&user.getUsername()!=null) {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("user",user);
            return "success";
        }else {
            return "error";
        }
    }
}
