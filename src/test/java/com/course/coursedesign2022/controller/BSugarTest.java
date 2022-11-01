package com.course.coursedesign2022.controller;

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
public class BSugarTest {
    @Inject
    private MockMvc mockMvc;

    @Autowired
    private com.course.coursedesign2022.mapper.BSugarMapper BSugarMapper;

    @Autowired
    private com.course.coursedesign2022.service.BloodSugar BloodSugar;

    @Test
    public void testBSugar() throws Exception{
        RequestBuilder requestBuilder;
        requestBuilder=put("/BloodSugar/3?BSRecord=5");
        mockMvc.perform(requestBuilder).
                andExpect(status().isOk());
    }
}
