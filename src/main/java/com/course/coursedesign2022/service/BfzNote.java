package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.RecordTimeMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.pojo.RecordTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BfzNote {
    @Autowired
    private RecordTimeMapper recordTimeMapper;

    @Autowired
    private UserMapper userMapper;

    public long BfzNote(RecordTime recordTime){
        PointObject pointObject = userMapper.getPointObjectByID(recordTime.getId());
        System.out.println("并发症记录成功");

        long start = LocalDateTime.now().withYear(LocalDateTime.now().getYear()).withMonth(1).withDayOfMonth(1).withHour(0).withMinute(0).withSecond(0).toEpochSecond(ZoneOffset.ofHours(8));
        long end = LocalDateTime.now().withYear(LocalDateTime.now().getYear()).withMonth(12).withDayOfMonth(31).withHour(23).withMinute(59).withSecond(59).toEpochSecond(ZoneOffset.ofHours(8));
        long now = LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8));
        long last = recordTime.getBfztime();

        if(last<start || last>end){
            int grow=pointObject.getGrowScore();
            pointObject.setGrowScore(grow+3);
            pointObject.setScoreTotal(pointObject.getGrowScore()+pointObject.getExchangeScore());
            userMapper.updatePointObject(pointObject);
            System.out.println("成长积分+3");
        }
        return now;
    }
}
