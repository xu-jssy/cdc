package com.course.coursedesign2022.service;

import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.LoginUser;
import com.course.coursedesign2022.pojo.PointObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class Login {
    @Autowired
    public LoginUserMapper loginUserMapper;

    @Autowired
    public UserMapper userMapper;

   public long login(int id) {

       LoginUser loginuser = loginUserMapper.selectByPrimaryKey(id);
       PointObject pointObject = userMapper.getPointObjectByID(id);
       System.out.println("登陆成功");

       //每日首次登陆判定
       long start = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0).toEpochSecond(ZoneOffset.ofHours(8));
       long end = LocalDateTime.now().withHour(23).withMinute(59).withSecond(59).toEpochSecond(ZoneOffset.ofHours(8));
       long now = LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8));
       long lastlogintime = loginuser.getLogintime();
       //上次登陆时间不在今天，首次登陆
       if(lastlogintime<start || lastlogintime>end){
           int grow=pointObject.getGrowScore();
           pointObject.setGrowScore(grow+1);
           pointObject.setScoreTotal(pointObject.getGrowScore()+pointObject.getExchangeScore());
           userMapper.updatePointObject(pointObject);
           System.out.println("成长积分+1");
       }
       return now;
   }

}
