package com.course.coursedesign2022.mapper;

import com.course.coursedesign2022.pojo.BSugar;
import com.course.coursedesign2022.pojo.BSugarExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BSugarMapper {
    long countByExample(BSugarExample example);

    int deleteByExample(BSugarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSugar record);

    int insertSelective(BSugar record);

    List<BSugar> selectByExample(BSugarExample example);

    BSugar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSugar record, @Param("example") BSugarExample example);

    int updateByExample(@Param("record") BSugar record, @Param("example") BSugarExample example);

    int updateByPrimaryKeySelective(BSugar record);

    int updateByPrimaryKey(BSugar record);
}