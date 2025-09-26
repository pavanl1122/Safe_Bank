

package com.wecp.progressive.entity;
// import java.sql.Date;

import java.util.Date;

<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @Column(name = "accountId", insertable = false, updatable = false)
    private int accountId;

    private double amount;
    private String transactionType;
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "accountId")
    private Accounts account;

    public Transactions() {
    }

    public Transactions(Integer transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
=======
@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int accountId;
    private double amount;
    private String transactionType;
    private Date transactionDate;
    public Transactions() {
    }
    public Transactions(int transactionId, int accountId, double amount, Date transactionDate, String transactionType) {
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
<<<<<<< HEAD
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
=======
    }  
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    
    

>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
}