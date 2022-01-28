package com.cisco.caseapp.utils;

import com.cisco.caseapp.CaseAppApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(classes = {CaseAppApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public abstract class BaseRestIntegrationTest {

    @Autowired
    protected MockMvc mockMvc;
}
