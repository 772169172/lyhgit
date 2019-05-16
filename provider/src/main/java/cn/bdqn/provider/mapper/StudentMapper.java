package cn.bdqn.provider.mapper;

import entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {
    //查询所有学员信息
    @Select("SELECT s.*,c.cName FROM student s,classes c WHERE s.classId=c.id ORDER BY s.id ASC")
    public List<Student> getAll();
    //根据学员编号查询学员信息
    @Select("SELECT * FROM student WHERE id=#{id}")
    public List<Student> getById(int id);
    //修改学员信息
    @Update("UPDATE student SET sName=#{sName}',birthday=NOW(),gender=#{gender},telephone=#{telephone},email=#{email},classId=#{classId} WHERE id=#{id}")
    public int update(Student student);
}
