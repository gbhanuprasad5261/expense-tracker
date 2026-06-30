package com.example.expense_tracker.service;

import com.example.expense_tracker.dto.ExpenseDTO;
import com.example.expense_tracker.entity.Expense;
import com.example.expense_tracker.exception.ExpenseNotFoundException;
import com.example.expense_tracker.repository.ExpenseRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

public ExpenseService(ExpenseRepository expenseRepository) {
    this.expenseRepository = expenseRepository;
}

    // Add Expense
    public Expense addExpense(ExpenseDTO expenseDTO) {

    Expense expense = new Expense();

    expense.setTitle(expenseDTO.getTitle());
    expense.setAmount(expenseDTO.getAmount());
    expense.setCategory(expenseDTO.getCategory());

    return expenseRepository.save(expense);
}

    // Get All Expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // Get Expense By Id
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id)
                .orElseThrow(() ->
                        new ExpenseNotFoundException("Expense not found with id: " + id));
    }

    // Update Expense
    public Expense updateExpense(Long id, Expense updatedExpense) {

        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() ->
                        new ExpenseNotFoundException("Expense not found with id: " + id));

        expense.setTitle(updatedExpense.getTitle());
        expense.setAmount(updatedExpense.getAmount());
        expense.setCategory(updatedExpense.getCategory());

        return expenseRepository.save(expense);
    }

    // Delete Expense
    public String deleteExpense(Long id) {

        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() ->
                        new ExpenseNotFoundException("Expense not found with id: " + id));

        expenseRepository.delete(expense);

        return "Expense deleted successfully";
    }
}