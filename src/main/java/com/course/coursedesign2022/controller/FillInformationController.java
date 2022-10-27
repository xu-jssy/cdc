package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.loginUserMapper;
import com.course.coursedesign2022.pojo.loginUser;
import com.course.coursedesign2022.service.FillInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FillInformationController {
    @Autowired
    public loginUserMapper loginUserMapper;

    @Autowired
    private FillInformation fillIn;


    @PutMapping(value = "/loginUser/fillIn/{zhanghao}")//修改个人信息
    public loginUser updateInformation(@PathVariable("zhanghao") Integer zhanghao,
                                         @RequestParam("information") Integer information){
        loginUser loginUser = loginUserMapper.selectByPrimaryKey(zhanghao);
//        System.out.println(loginUser.getZhanghao());
//        System.out.println(loginUser.getInformation());
//        System.out.println(loginUserMapper.selectByPrimaryKey(zhanghao).getInformation());
        fillIn.Fillinformation(loginUser);//首次加分策略
        if(information==-1){loginUser.setInformation(0);}
        else {loginUser.setInformation(information);}
        //loginUser.setInformation(information);
        loginUserMapper.updateByPrimaryKey(loginUser);
        return loginUserMapper.selectByPrimaryKey(zhanghao);
    }

}
