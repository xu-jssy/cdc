package com.course.coursedesign2022.controller;
import static org.hamcrest.Matchers.equalTo;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.pojo.PointObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import javax.inject.Inject;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class FollowUpTest {
    //http请求的模拟
    @Inject
    private MockMvc mockMvc;

    @Autowired
    UserMapper userMapper;

    public void printUser(int id) {
        PointObject pointObject = userMapper.getPointObjectByID(id);
        System.out.println(pointObject);
    }

    public void printAllUser() {
        List<PointObject> pointObjects = userMapper.getPointObject();
        for (PointObject pointObject : pointObjects) {
            System.out.println(pointObject);
        }
        System.out.println("---------");
    }

    @Test
    public void testFollowUp() throws Exception{
        printUser(1);
        RequestBuilder requestBuilder;
        requestBuilder=get("/user/FollowUp/1");
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk());
        printUser(1);
    }

}
