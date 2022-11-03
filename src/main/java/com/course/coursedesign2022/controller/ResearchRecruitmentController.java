package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import com.course.coursedesign2022.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResearchRecruitmentController {
    @Autowired
    private ResearchRecruitment researchRecruitment;

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value="/user/research/{id}")
    public PointObject researchRecruitment(@PathVariable("id") Integer id){
        researchRecruitment.ResearchRecruitment(id);
        return userMapper.getPointObjectByID(id);

    }
}
