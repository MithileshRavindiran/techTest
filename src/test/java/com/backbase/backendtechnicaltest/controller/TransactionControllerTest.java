package com.backbase.backendtechnicaltest.controller;

import com.backbase.backendtechnicaltest.BackendTechnicalTestApplication;
import com.backbase.backendtechnicaltest.dto.TransactionDto;
import com.backbase.backendtechnicaltest.service.TransactionServiceLayer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.MOCK, classes={ BackendTechnicalTestApplication.class })
public class TransactionControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    TransactionServiceLayer transactionServiceLayer;


    private static final ObjectMapper jsonMapper = new ObjectMapper();

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void getAllTransactionsShouldReturnTransactionDtoList() throws Exception {
        // Create a TransactionDtoList to Return
        List<TransactionDto> transactionDtoList = new ArrayList<>();

        // Define response when service layer method is run
        when(transactionServiceLayer.transformOpenBankObjectToBackbaseObject()).thenReturn(transactionDtoList);

        // Mock the expected value
        this.mockMvc.perform(MockMvcRequestBuilders.get("/transactions"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
