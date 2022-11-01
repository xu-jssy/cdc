package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.BSugarMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.BSugar;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodSugar {
    @Autowired
    private BSugarMapper BSugarMapper;
    @Autowired
    private UserMapper userMapper;

    public void BSRecord(BSugar BSguar){
        System.out.println("血糖记录成功");
        PointObject PointObject = userMapper.getPointObjectByID(BSguar.getId());
        if(BSguar.getBsrecord()>3){
            int grow = PointObject.getGrowScore();
            PointObject.setGrowScore(grow+1);
            System.out.println(PointObject.getGrowScore()+PointObject.getExchangeScore());
            PointObject.setScoreTotal(PointObject.getGrowScore()+PointObject.getExchangeScore());
            userMapper.updatePointObject(PointObject);
            System.out.println("成长积分+1");
        }

    }
}
