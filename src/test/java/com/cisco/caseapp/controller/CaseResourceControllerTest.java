package com.cisco.caseapp.controller;

import com.cisco.caseapp.service.CaseService;
import com.cisco.caseapp.utils.BaseRestIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CaseResourceControllerTest extends BaseRestIntegrationTest {

    @Autowired
    private CaseService service;


    @Test
    public void givenRequestWithStatusSpecified_whenGetCases_thenExpectStatusOk() throws Exception {
        mockMvc.perform(get("/cases/status/{status}")
                        .param("status", "OPEN"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
