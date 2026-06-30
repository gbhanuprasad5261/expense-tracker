package com.example.expense_tracker.controller;

import com.example.expense_tracker.entity.Expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.expense_tracker.service.ExpenseService;

import com.example.expense_tracker.dto.ExpenseDTO;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
     private ExpenseService expenseService;

    @PostMapping
public Expense addExpense(@RequestBody ExpenseDTO expenseDTO) {
    return expenseService.addExpense(expenseDTO);
}

    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }
   @DeleteMapping("/{id}")
public String deleteExpense(@PathVariable Long id) {

    expenseService.deleteExpense(id);

    return "Expense deleted successfully";
}
   @PutMapping("/{id}")
public Expense updateExpense(@PathVariable Long id,
                             @RequestBody Expense updatedExpense) {

    return expenseService.updateExpense(id, updatedExpense);
}
@GetMapping("/{id}")
public Expense getExpenseById(@PathVariable Long id) {
    return expenseService.getExpenseById(id);
}

}