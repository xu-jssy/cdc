package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.RecordTimeMapper;
import com.course.coursedesign2022.pojo.RecordTime;
import com.course.coursedesign2022.service.BfzNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BfzNoteController {
    @Autowired
    private RecordTimeMapper recordTimeMapper;

    @Autowired
    private BfzNote bfzNote;

    @PutMapping(value="/BfzRecord")
    public RecordTime FillBfzRecord(@RequestParam("id") Integer id){
        RecordTime recordTime = recordTimeMapper.selectByPrimaryKey(id);
        long now = bfzNote.BfzNote(recordTime);
        recordTime.setBfztime(now);
        recordTimeMapper.updateByPrimaryKey(recordTime);
        return recordTimeMapper.selectByPrimaryKey(id);
    }
}
