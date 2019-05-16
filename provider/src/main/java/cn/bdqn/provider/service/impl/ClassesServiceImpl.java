package cn.bdqn.provider.service.impl;

import cn.bdqn.provider.mapper.ClassesMapper;
import entity.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ClassesService;

import java.util.List;
@Service
@Transactional
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public List<Classes> getAllClasses() {
        return classesMapper.getAllClasses();
    }
}
