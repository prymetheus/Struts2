package com.qf.service;

import com.qf.dao.StudentDao;
import com.qf.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao dao;
    //新增
    public boolean addStudent(Student student){

        return dao.addStudent(student);
    }
    //查询
    public List<Student> query(){
        //return factory.getCurrentSession().createNativeQuery("select * from t_student",Student.class).getResultList();
        return dao.query();
    }
    //修改
    public void updateStudent(Student student){
        dao.updateStudent(student);
    }
    //删除
    public void deleteStudent(long id){
        ;Student student=new Student();
        student.setId(id);
        dao.deleteStudent(student);
    }
}
