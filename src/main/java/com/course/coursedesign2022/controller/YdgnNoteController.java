package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.RecordTimeMapper;
import com.course.coursedesign2022.pojo.RecordTime;
import com.course.coursedesign2022.service.YdgnNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class YdgnNoteController {
    @Autowired
    private RecordTimeMapper recordTimeMapper;

    @Autowired
    private YdgnNote ydgnNote;

    @PutMapping(value="/YdgnNote")
    public RecordTime FillBfzRecord(@RequestParam("id") Integer id){
        RecordTime recordTime = recordTimeMapper.selectByPrimaryKey(id);
        ydgnNote.YdgnNote(recordTime);


        return recordTimeMapper.selectByPrimaryKey(id);
    }
}
