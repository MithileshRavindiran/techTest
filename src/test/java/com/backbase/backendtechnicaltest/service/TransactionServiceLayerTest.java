package com.backbase.backendtechnicaltest.service;

import com.backbase.backendtechnicaltest.config.TransactionConfiguration;
import com.backbase.backendtechnicaltest.dto.TransactionDto;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by mravindran on 25/03/20.
 */
public class TransactionServiceLayerTest {

    @InjectMocks
    TransactionServiceLayer transactionServiceLayer;

    @Spy
    TransactionConfiguration transactionConfiguration;


    MockWebServer mockWebServer = new MockWebServer();

    @Before
    public void setup() throws URISyntaxException {
        MockitoAnnotations.initMocks(this);
        this.transactionConfiguration.setBaseUrl(mockWebServer.url("localhost/").toString());
        this.transactionConfiguration.setUri(new URI("obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions"));
    }

    @After
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    public void testCode() {
        mockWebServer.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .setBody("\"\\\"transactions\\\":[{\\\"id\\\":\\\"897706c1-dcc6-4e70-9d85-8a537c7cbf3e\\\",\\\"this_account\\\":{\\\"id\\\":\\\"savings-kids-john\\\",\\\"holders\\\":[{\\\"name\\\":\\\"Savings - Kids John\\\",\\\"is_alias\\\":false}],\\\"number\\\":\\\"832425-00304050\\\",\\\"kind\\\":\\\"savings\\\",\\\"IBAN\\\":null,\\\"swift_bic\\\":null,\\\"bank\\\":{\\\"national_identifier\\\":\\\"rbs\\\",\\\"name\\\":\\\"The Royal Bank of Scotland\\\"}},\\\"other_account\\\":{\\\"id\\\":\\\"E806HT1hp-IfBH0DP1rCFrPAftEtpCAwU-XlMo_9bzM\\\",\\\"holder\\\":{\\\"name\\\":\\\"ALIAS_49532E\\\",\\\"is_alias\\\":true},\\\"number\\\":\\\"savings-kids-john\\\",\\\"kind\\\":null,\\\"IBAN\\\":null,\\\"swift_bic\\\":null,\\\"bank\\\":{\\\"national_identifier\\\":\\\"rbs\\\",\\\"name\\\":\\\"rbs\\\"},\\\"metadata\\\":{\\\"public_alias\\\":null,\\\"private_alias\\\":null,\\\"more_info\\\":null,\\\"URL\\\":null,\\\"image_URL\\\":null,\\\"open_corporates_URL\\\":null,\\\"corporate_location\\\":null,\\\"physical_location\\\":null}},\\\"details\\\":{\\\"type\\\":\\\"SANDBOX_TAN\\\",\\\"description\\\":\\\"Gift\\\",\\\"posted\\\":\\\"2017-10-15T14:22:28Z\\\",\\\"completed\\\":\\\"2017-10-15T14:22:28Z\\\",\\\"new_balance\\\":{\\\"currency\\\":\\\"GBP\\\",\\\"amount\\\":null},\\\"value\\\":{\\\"currency\\\":\\\"GBP\\\",\\\"amount\\\":\\\"-90.00\\\"}},\\\"metadata\\\":{\\\"narrative\\\":null,\\\"comments\\\":[],\\\"tags\\\":[],\\\"images\\\":[],\\\"where\\\":null}}]}\""));

        List<TransactionDto> response = transactionServiceLayer.transformOpenBankObjectToBackbaseObject();
        System.out.println(response);
    }
}
