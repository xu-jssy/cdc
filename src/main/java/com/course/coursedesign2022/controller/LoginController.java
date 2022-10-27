package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.loginUserMapper;
import com.course.coursedesign2022.pojo.loginUser;
import com.course.coursedesign2022.service.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private loginUserMapper loginUserMapper;
    @Autowired
    private Login login;

    @GetMapping(value = "/loginUser/query/{zhanghao}")
    public loginUser getloginUserByzhanghao(@PathVariable("zhanghao") Integer zhanghao){return loginUserMapper.selectByPrimaryKey(zhanghao);}

    @PostMapping(value = "/loginUser/add/")
    public loginUser addloginUser(@RequestParam("zhanghao") int zhanghao,
                                    @RequestParam("mima") int mima){
        loginUser loginuser = new loginUser();
        loginuser.setZhanghao(zhanghao);
        loginuser.setMima(mima);
        loginUserMapper.insertSelective(loginuser);
        return loginUserMapper.selectByPrimaryKey(zhanghao);
    }

    @DeleteMapping(value="/loginUser/delete/{zhanghao}")//注销账号
    public loginUser deleteUserByZhanghao(@PathVariable("zhanghao") Integer zhanghao){
        loginUserMapper.deleteByPrimaryKey(zhanghao);
        loginUser loginuser=loginUserMapper.selectByPrimaryKey(zhanghao);
        return loginuser;
    }

    @PutMapping(value="/loginUser/{zhanghao}")//修改密码
    public loginUser updateUser(@PathVariable("zhanghao") Integer zhanghao,
                                  @RequestParam("mima") Integer mima){
        loginUser loginuser = loginUserMapper.selectByPrimaryKey(zhanghao);
        loginuser.setMima(mima);
        loginUserMapper.updateByPrimaryKey(loginuser);
        return loginUserMapper.selectByPrimaryKey(zhanghao);
    }

    @PutMapping(value = "/loginUser/login/")//登陆
    public loginUser Login(@RequestParam("zhanghao") Integer zhanghao,
                        @RequestParam("mima") Integer mima){
        loginUser loginuser = loginUserMapper.selectByPrimaryKey(zhanghao);
        if(mima.equals(loginuser.getMima())){
            loginuser.setLogintime(login.login(zhanghao));
        }
        loginUserMapper.updateByPrimaryKey(loginuser);
        return loginUserMapper.selectByPrimaryKey(zhanghao);
    }



}
