package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.service.ExtendedActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExtendedActivityController {
    @Autowired
    private ExtendedActivity extendedActivity;

    @Autowired
    UserMapper userMapper;

    @GetMapping(value="/user/extendedActivity/{id}")
    public PointObject extendedActivity(@PathVariable("id") Integer id){
        extendedActivity.ExtendedActivity(id);
        return userMapper.getPointObjectByID(id);

    }
}
