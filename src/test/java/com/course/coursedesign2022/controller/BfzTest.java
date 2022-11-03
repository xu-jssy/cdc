package com.course.coursedesign2022.controller;

import com.course.coursedesign2022.mapper.UserMapper;
import com.course.coursedesign2022.service.BfzNote;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import javax.inject.Inject;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class BfzTest
{
    @Inject
    private MockMvc mockMvc;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BfzNote BfzNote;

    @Test
    public void testBSugar() throws Exception
    {
        RequestBuilder requestBuilder;
        requestBuilder=put("");
        mockMvc.perform(requestBuilder).
                andExpect(status().isOk());
    }
}
