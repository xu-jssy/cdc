package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.RecordTimeMapper;
import com.course.coursedesign2022.pojo.RecordTime;
import com.course.coursedesign2022.service.EvaluateReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EvaluateReportController {
    @Autowired
    private RecordTimeMapper recordTimeMapper;

    @Autowired
    private EvaluateReport evaluateReport;

    @PutMapping(value="/EvaluateReport")
    public RecordTime CreateEvaluateReport(@RequestParam("id") Integer id){
        evaluateReport.EvaluateReport(id);
        return recordTimeMapper.selectByPrimaryKey(id);
    }
}
