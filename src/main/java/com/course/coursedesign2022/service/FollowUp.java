package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowUp {
    @Autowired
    private UserMapper userMapper;

    public void FollowUp(int id){
        PointObject pointObject = userMapper.getPointObjectByID(id);
        int exchange = pointObject.getExchangeScore();
        int total = pointObject.getScoreTotal();
        pointObject.setExchangeScore(exchange+3);
        pointObject.setScoreTotal(total+3);
        userMapper.updatePointObject(pointObject);
        System.out.println("完成门诊随访");
        System.out.println("可兑换积分+3");
    }
}