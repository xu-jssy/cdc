package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.RecordTimeMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.pojo.RecordTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class YdgnNote {
    @Autowired
    private RecordTimeMapper recordTimeMapper;

    @Autowired
    private UserMapper userMapper;

    public void YdgnNote(RecordTime recordTime) {
        PointObject pointObject = userMapper.getPointObjectByID(recordTime.getId());
        System.out.println("胰岛功能监测成功");

        long start = recordTime.getYdgntime();
        LocalDateTime start_Date = LocalDateTime.ofEpochSecond(start, 0, ZoneOffset.ofHours(8));
        long end = (start_Date.plusMonths(3)).toEpochSecond(ZoneOffset.ofHours(8));
        long now = LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8));

        if (now < start || now > end) {//三个月后
            int grow = pointObject.getGrowScore();
            pointObject.setGrowScore(grow + 2);
            pointObject.setScoreTotal(pointObject.getGrowScore()+pointObject.getExchangeScore());
            userMapper.updatePointObject(pointObject);
            System.out.println("成长积分+2");
            recordTime.setYdgntime(now);
            recordTimeMapper.updateByPrimaryKey(recordTime);
        }

    }
}
