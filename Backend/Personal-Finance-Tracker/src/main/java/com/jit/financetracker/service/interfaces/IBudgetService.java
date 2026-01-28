package com.jit.financetracker.service.interfaces;

import com.jit.financetracker.dto.request.BudgetRequestDto;
import com.jit.financetracker.dto.response.BudgetResponseDto;

import java.util.List;

public interface IBudgetService {

    public BudgetResponseDto saveBudget(BudgetRequestDto request);
    public List<BudgetResponseDto> getMyBudgets();
    public void deleteBudget(Long budgetId);

}
