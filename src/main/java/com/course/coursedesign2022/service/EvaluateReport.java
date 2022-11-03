package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.BSugarMapper;
import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.LoginUser;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;

public class EvaluateReport {
    @Autowired
    private LoginUserMapper loginUserMapper;

    @Autowired
    private BSugarMapper bSugarMapper;

    @Autowired
    private UserMapper userMapper;

    public void EvaluateReport(int id){

        PointObject pointObject = userMapper.getPointObjectByID(id);
        LoginUser loginUser = loginUserMapper.selectByPrimaryKey(id);

        if ((loginUser.getInformation()!=-1)
                && (bSugarMapper.selectByPrimaryKey(id).getCount()>=10)){
            System.out.println("评估报告生成成功");
            int grow=pointObject.getGrowScore();
            pointObject.setGrowScore(grow+2);
            pointObject.setScoreTotal(pointObject.getGrowScore()+pointObject.getExchangeScore());
            userMapper.updatePointObject(pointObject);
            System.out.println("成长积分+2");
        }

    }
}
