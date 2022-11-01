package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.pojo.BSugar;
import com.course.coursedesign2022.mapper.BSugarMapper;
import com.course.coursedesign2022.service.BloodSugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloodSugarController {

    @Autowired
    private BSugarMapper BSugarMapper;

    @Autowired
    private BloodSugar BloodSugar;

    @PutMapping(value="/BloodSugar/{id}")//修改血糖记录
    public BSugar updateUser(@PathVariable("id") Integer id,
                             @RequestParam("BSRecord") Integer BSRecord){
        BSugar BSugar = BSugarMapper.selectByPrimaryKey(id);
        BSugar.setBsrecord(BSRecord);
        System.out.println(BSugar.getBsrecord());
        BSugar.setCount(BSugar.getCount()+1);
        BloodSugar.BSRecord(BSugar);//血糖加分策略
        BSugarMapper.updateByPrimaryKey(BSugar);
        return BSugarMapper.selectByPrimaryKey(id);
    }


}
