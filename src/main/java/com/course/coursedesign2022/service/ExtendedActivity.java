package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtendedActivity {
    @Autowired
    private UserMapper userMapper;

    public void ExtendedActivity(int id){
        PointObject pointObject = userMapper.getPointObjectByID(id);
        int exchange = pointObject.getExchangeScore();
        int total = pointObject.getScoreTotal();
        pointObject.setExchangeScore(exchange+5);
        pointObject.setScoreTotal(total+5);
        userMapper.updatePointObject(pointObject);
        System.out.println("完成扩展活动");
        System.out.println("可兑换积分+5");
    }
}