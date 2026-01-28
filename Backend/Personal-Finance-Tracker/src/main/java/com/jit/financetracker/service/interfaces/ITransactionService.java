package com.jit.financetracker.service.interfaces;

import com.jit.financetracker.dto.response.TransactionResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ITransactionService {


    public List<TransactionResponseDto> getAllTransactions();

    public Page<TransactionResponseDto> getAllTransactionsPaged(
            int page,
            int size
    );
}
