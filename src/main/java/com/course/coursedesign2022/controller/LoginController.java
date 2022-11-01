package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.pojo.LoginUser;
import com.course.coursedesign2022.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginUserMapper loginUserMapper;
    @Autowired
    private Login login;

    @GetMapping(value = "/loginUser/query/{id}")
    public LoginUser getloginUserById(@PathVariable("id") Integer id){return loginUserMapper.selectByPrimaryKey(id);}

    @PostMapping(value = "/loginUser/add")
    public LoginUser addloginUser(@RequestParam("id") int id,
                                    @RequestParam("mima") int mima){
        LoginUser loginuser = new LoginUser();
        loginuser.setId(id);
        loginuser.setMima(mima);
        loginUserMapper.insertSelective(loginuser);
        return loginUserMapper.selectByPrimaryKey(id);
    }

    @DeleteMapping(value="/loginUser/delete/{id}")//注销账号
    public LoginUser deleteUserByZhanghao(@PathVariable("id") Integer id){
        loginUserMapper.deleteByPrimaryKey(id);
        LoginUser loginuser=loginUserMapper.selectByPrimaryKey(id);
        return loginuser;
    }

    @PutMapping(value="/loginUser/{id}")//修改密码
    public LoginUser updateUser(@PathVariable("id") Integer id,
                                  @RequestParam("mima") Integer mima){
        LoginUser loginuser = loginUserMapper.selectByPrimaryKey(id);
        loginuser.setMima(mima);
        loginUserMapper.updateByPrimaryKey(loginuser);
        return loginUserMapper.selectByPrimaryKey(id);
    }

    @PutMapping(value = "/login/")//登陆
    public LoginUser Login(@RequestParam("id") Integer id,
                           @RequestParam("mima") Integer mima){
        LoginUser loginuser = loginUserMapper.selectByPrimaryKey(id);
        if(mima.equals(loginuser.getMima())){
            loginuser.setLogintime(login.login(id));
        }
        loginUserMapper.updateByPrimaryKey(loginuser);
        return loginUserMapper.selectByPrimaryKey(id);
    }



}
