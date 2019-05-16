package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    //查询所有学员信息
    public List<Student> getAll();
    //根据学员编号查询学员信息
    public List<Student> getById(int id);
    //修改学员信息
    public int update(Student student);
}
