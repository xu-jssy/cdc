package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.service.FollowUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FollowUpController {
    @Autowired
    private FollowUp followUp;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value="/user/FollowUp/{id}")
    public PointObject followUp(@PathVariable("id") Integer id){
        followUp.FollowUp(id);
        return userMapper.getPointObjectByID(id);

    }
}
