package com.qf.dao;

import com.qf.domain.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDao {
    @Autowired
    private SessionFactory factory;
    //新增
    public boolean addStudent(Student  student){

        return (Long)factory.getCurrentSession().save(student)>0l;
    }
    //查询
    public List<Student> query(){
        //factory.getCurrentSession().createNativeQuery("SELECT * FROM t_student",Student.class).getResultList();
return factory.getCurrentSession().createQuery("from Student",Student.class).getResultList();
    }
    //修改
    public void updateStudent(Student student){
        factory.getCurrentSession().update(student);
    }
    //删除
    public void deleteStudent(Student student){
        factory.getCurrentSession().delete(student);
    }
}
