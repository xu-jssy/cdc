package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.LoginUser;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillInformation {
    @Autowired
    public LoginUserMapper loginUserMapper;
    @Autowired
    public UserMapper userMapper;

    public void Fillinformation(LoginUser loginUser){

        PointObject pointObject = userMapper.getPointObjectByID(loginUser.getId());
        System.out.println("信息已修改");
        if(loginUser.getInformation()==-1){

            int grow=pointObject.getGrowScore();
            pointObject.setGrowScore(grow+2);
            pointObject.setScoreTotal(pointObject.getGrowScore()+pointObject.getExchangeScore());
            userMapper.updatePointObject(pointObject);
            System.out.println("成长积分+2");

        }


    }
}
