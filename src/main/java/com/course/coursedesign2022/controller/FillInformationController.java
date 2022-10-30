package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.pojo.LoginUser;
import com.course.coursedesign2022.service.FillInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FillInformationController {
    @Autowired
    public LoginUserMapper loginUserMapper;

    @Autowired
    private FillInformation fillIn;


    @PutMapping(value = "/loginUser/fillIn/{id}")//修改个人信息
    public LoginUser updateInformation(@PathVariable("id") Integer id,
                                       @RequestParam("information") Integer information){
        LoginUser loginUser = loginUserMapper.selectByPrimaryKey(id);
//        System.out.println(loginUser.getZhanghao());
//        System.out.println(loginUser.getInformation());
//        System.out.println(loginUserMapper.selectByPrimaryKey(zhanghao).getInformation());
        fillIn.Fillinformation(loginUser);//首次加分策略
        if(information==-1){loginUser.setInformation(0);}
        else {loginUser.setInformation(information);}
        //loginUser.setInformation(information);
        loginUserMapper.updateByPrimaryKey(loginUser);
        return loginUserMapper.selectByPrimaryKey(id);
    }

}
