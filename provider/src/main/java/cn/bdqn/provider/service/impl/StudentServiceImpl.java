package cn.bdqn.provider.service.impl;

import cn.bdqn.provider.mapper.StudentMapper;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.StudentService;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public List<Student> getById(int id) {
        return studentMapper.getById(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }
}
