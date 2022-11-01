package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.LoginUserMapper;
import com.course.coursedesign2022.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import javax.inject.Inject;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class loginTest {
    @Inject
    private MockMvc mockMvc;

    @Autowired
    UserMapper userMapper;

    @Autowired
    LoginUserMapper loginUserMapper;


    @Test
    public void testLogin() throws Exception{
        RequestBuilder requestBuilder;
        requestBuilder=put("/login/?id=3&mima=123456");
        mockMvc.perform(requestBuilder).
                andExpect(status().isOk());
    }
}
