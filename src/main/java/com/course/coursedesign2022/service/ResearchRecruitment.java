package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearchRecruitment {
    @Autowired
    private UserMapper userMapper;

    public void ResearchRecruitment(int id){
        PointObject pointObject = userMapper.getPointObjectByID(id);
        int grow = pointObject.getExchangeScore();
        int total = pointObject.getScoreTotal();
        pointObject.setExchangeScore(grow+8);
        pointObject.setScoreTotal(total+8);
        userMapper.updatePointObject(pointObject);
        System.out.println("已参加科研招募");
        System.out.println("可兑换积分+8");
    }
}
