package com.course.coursedesign2022.mapper;

import com.course.coursedesign2022.pojo.loginUser;
import com.course.coursedesign2022.pojo.loginUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface loginUserMapper {
    long countByExample(loginUserExample example);

    int deleteByExample(loginUserExample example);

    int deleteByPrimaryKey(Integer zhanghao);

    int insert(loginUser record);

    int insertSelective(loginUser record);

    List<loginUser> selectByExample(loginUserExample example);

    loginUser selectByPrimaryKey(Integer zhanghao);

    int updateByExampleSelective(@Param("record") loginUser record, @Param("example") loginUserExample example);

    int updateByExample(@Param("record") loginUser record, @Param("example") loginUserExample example);

    int updateByPrimaryKeySelective(loginUser record);

    int updateByPrimaryKey(loginUser record);
}