package com.example.expense_tracker.dto;

public class ExpenseDTO {

    private String title;
    private Double amount;
    private String category;

    public ExpenseDTO() {
    }

    public ExpenseDTO(String title, Double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}