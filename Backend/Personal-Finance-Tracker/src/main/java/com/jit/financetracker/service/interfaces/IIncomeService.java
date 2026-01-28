package com.jit.financetracker.service.interfaces;

import com.jit.financetracker.dto.request.IncomeRequestDto;
import com.jit.financetracker.dto.response.IncomeResponseDto;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.List;

public interface IIncomeService  {

    public IncomeResponseDto addIncome(IncomeRequestDto request);

    public List<IncomeResponseDto> getMyIncome();

    public Page<IncomeResponseDto> getIncomesPaged(
            int page,
            int size,
            String sortBy,
            String direction,
            LocalDate startDate,
            LocalDate endDate
    );

    public void deleteIncome(Long id);

}
