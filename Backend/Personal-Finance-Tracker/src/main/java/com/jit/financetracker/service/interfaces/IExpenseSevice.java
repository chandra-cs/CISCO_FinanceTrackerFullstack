package com.jit.financetracker.service.interfaces;

import com.jit.financetracker.dto.request.ExpenseRequestDto;
import com.jit.financetracker.dto.response.ExpenseResponseDto;
import com.jit.financetracker.enums.ExpenseCategory;

import java.time.LocalDate;
import java.util.List;

public interface IExpenseSevice {

    public ExpenseResponseDto addExpense(ExpenseRequestDto request);

    public List<ExpenseResponseDto> getMyExpenses();

    public org.springframework.data.domain.Page<ExpenseResponseDto> getExpensesPaged(
            int page,
            int size,
            String sortBy,
            String direction,
            ExpenseCategory category,
            LocalDate startDate,
            LocalDate endDate
    );

    public void deleteExpense(Long id);

}
