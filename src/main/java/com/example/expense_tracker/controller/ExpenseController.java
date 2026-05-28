package com.example.expense_tracker.controller;

import com.example.expense_tracker.entity.Expense;
import com.example.expense_tracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense);
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    @DeleteMapping("/{id}")
public String deleteExpense(@PathVariable Long id) {

    expenseRepository.deleteById(id);

    return "Expense deleted successfully";
    }
    @PutMapping("/{id}")
public Expense updateExpense(@PathVariable Long id,
                             @RequestBody Expense updatedExpense) {

    Expense expense = expenseRepository.findById(id).orElseThrow();

    expense.setTitle(updatedExpense.getTitle());
    expense.setAmount(updatedExpense.getAmount());
    expense.setCategory(updatedExpense.getCategory());

    return expenseRepository.save(expense);
}
}