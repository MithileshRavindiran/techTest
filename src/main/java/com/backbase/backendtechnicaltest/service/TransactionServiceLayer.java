package com.backbase.backendtechnicaltest.service;
import com.backbase.backendtechnicaltest.config.TransactionConfiguration;
import com.backbase.backendtechnicaltest.dto.TransactionDto;
import com.backbase.backendtechnicaltest.mapper.TransactionMapper;
import com.backbase.backendtechnicaltest.model.Transaction;
import com.backbase.backendtechnicaltest.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;


@Service
public class TransactionServiceLayer {

    private TransactionConfiguration transactionConfiguration;

    private WebClient webClient;

    @Autowired
    public TransactionServiceLayer(TransactionConfiguration  transactionConfiguration) {
        this.transactionConfiguration = transactionConfiguration;
        this.webClient = WebClient.builder().baseUrl(transactionConfiguration.getBaseUrl() +  transactionConfiguration.getUri())
                .filter(logRequest())
                .build();
    }

    /**
     * Transforms a OpenBank Transaction object to a Backbase object
     * @return A BackbaseModels object containing an ArrayList of BackBaseModel objects
     */
    public List<TransactionDto> transformOpenBankObjectToBackbaseObject() {
        Transactions transactionList = webClient.get().uri(transactionConfiguration.getBaseUrl() +  transactionConfiguration.getUri()).retrieve().bodyToMono(Transactions.class).block();
        ArrayList<TransactionDto> transactionDtoList = new ArrayList<>();
        if (transactionList != null && !transactionList.getTransactions().isEmpty()) {
            transactionList.getTransactions().forEach(transaction -> transactionDtoList.add(TransactionMapper.INSTANCE.transactionToBackbaseDTO(transaction)));
        }
        return transactionDtoList;
    }

    private ExchangeFilterFunction logRequest() {
        return (clientRequest, next) -> {
            clientRequest.headers()
                    .forEach((name, values) -> values.forEach(value -> System.out.println("{}={}" + name + value)));
            return next.exchange(clientRequest);
        };
    }
}