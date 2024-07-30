package com.reimbursement.entities;

import jakarta.persistence.*;



@Entity
@Table(name="claimrequest")
public class ClaimRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private String expense_Type;
    private String status;

    public String getManager_comment() {
        return manager_comment;
    }

    public void setManager_comment(String manager_comment) {
        this.manager_comment = manager_comment;
    }

    private String manager_comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public int getStatus() {
        return amount;
    }

    public void setStatus(int amount) {
        this.amount = amount;
    }
    public String getExpense_Type() {
        return expense_Type;
    }

    public void setExpense_Type(String expense_Type) {
        this.expense_Type = expense_Type;
    }

}
