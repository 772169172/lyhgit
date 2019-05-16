package cn.bdqn.provider.mapper;

import entity.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ClassesMapper {
    //查询所有班级信息
    @Select("SELECT * FROM classes")
    public List<Classes> getAllClasses();
}
