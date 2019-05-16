package cn.bdqn.consumer.controller;

import entity.Classes;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClassesService;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassesService classesService;
    @RequestMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAll();
    }
    @RequestMapping("/getById")
    public List<Student> getById(int id){
        return studentService.getById(id);
    }
    @RequestMapping("/update")
    public int update(Student student){
        return studentService.update(student);
    }
    @RequestMapping("/getAllClasses")
    public List<Classes> getAllClasses(){
        return classesService.getAllClasses();
    }
}
