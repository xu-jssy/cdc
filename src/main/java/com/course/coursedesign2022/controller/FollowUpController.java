package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.service.FollowUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowUpController {
    @Autowired
    private FollowUp followUp;

    @Autowired
    private UserMapper userMapper;

    @PutMapping(value = "/FollowUp")
    public PointObject Followup(@RequestParam("id") Integer id){
        System.out.println(id);
        PointObject pointObject = userMapper.getPointObjectByID(id);
        followUp.FollowUp(id);
        return pointObject;
    }
}
