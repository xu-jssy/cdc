package com.course.coursedesign2022.mapper;

import com.course.coursedesign2022.pojo.RecordTime;
import com.course.coursedesign2022.pojo.RecordTimeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecordTimeMapper {
    long countByExample(RecordTimeExample example);

    int deleteByExample(RecordTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecordTime record);

    int insertSelective(RecordTime record);

    List<RecordTime> selectByExample(RecordTimeExample example);

    RecordTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordTime record, @Param("example") RecordTimeExample example);

    int updateByExample(@Param("record") RecordTime record, @Param("example") RecordTimeExample example);

    int updateByPrimaryKeySelective(RecordTime record);

    int updateByPrimaryKey(RecordTime record);
}