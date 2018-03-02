package com.qf.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qf.domain.Student;
import com.qf.service.StudentService;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
@Controller("stu")
public class StudentAction extends ActionSupport implements ModelDriven<Student> {
    @Autowired
    private StudentService service;
    //就是为了传参
    private Student student=new Student();
    @Override
    public Student getModel() {
        return null;
    }
    //如果属性多了可以独立封装
    private File headerImg;//获取上传的文件对象，那么file标签的name名称
    private String headerImgFileName;//获取上传的文件名
    private String headerImgContentType;//获取上传的MIME类型

    public File getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(File headerImg) {
        this.headerImg = headerImg;
    }

    public String getHeaderImgFileName() {
        return headerImgFileName;
    }

    public void setHeaderImgFileName(String headerImgFileName) {
        this.headerImgFileName = headerImgFileName;
    }

    public String getHeaderImgContentType() {
        return headerImgContentType;
    }

    public void setHeaderImgContentType(String headerImgContentType) {
        this.headerImgContentType = headerImgContentType;
    }

    //新增
    public String add() throws IOException {
        if(student!=null){
            //头像保存--图片上传
            //获取保存图片的路径
            File dir=new File(new File(ServletActionContext.getServletContext().getRealPath("/")).getParent(),"s2shimgs");
            if(!dir.exists()){
                dir.mkdirs();
            }
            String fn=System.currentTimeMillis()+"_"+headerImgFileName;
            File desFile=new File(dir,fn);
            //拷贝文件
            FileUtils.copyFile(headerImg,desFile);
            System.out.println("头像上传成功："+desFile.getAbsolutePath());
            //数据保存
            student.setImgUrl(fn);
            System.out.println("新增学生："+service.addStudent(student));
            return "list";
        }else {
            return "add";
        }
    }
    //删除
    //修改
    //查询
    public String queryList(){
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("list",service.query());
        return "list";
    }
}
