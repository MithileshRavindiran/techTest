package com.backbase.backendtechnicaltest.mapper;

import com.backbase.backendtechnicaltest.dto.TransactionDto;
import com.backbase.backendtechnicaltest.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "thisAccount.id", target = "accountId"),
            @Mapping(source = "otherAccount.number", target = "counterPartyAccount"),
            @Mapping(source = "otherAccount.holder.name", target = "counterPartyName"),
            @Mapping(source = "otherAccount.otherAccountMetadata.imageUrl", target = "counterPartyLogoPath"),
            @Mapping(source = "details.value.amount", target = "instructedAmount"),
            @Mapping(source = "details.value.currency", target = "instructedCurrency"),
            @Mapping(source = "details.value.amount", target = "transactionAmount"),
            @Mapping(source = "details.value.currency", target = "transactionCurrency"),
            @Mapping(source = "details.type", target = "transactionType"),
            @Mapping(source = "details.description", target = "description")
    })
    TransactionDto transactionToBackbaseDTO(Transaction transaction);
}
