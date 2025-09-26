package com.wecp.progressive.entity;

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

=======
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321

@Entity
public class Accounts implements Comparable<Accounts>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Integer accountId;
    @Column(name = "customerId", insertable = false, updatable = false)
    private int customerId;
    private double balance;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customers customer;
    public Accounts() {
    }
    public Accounts(Integer accountId, int customerId, double balance) {
=======
    private int accountId;
    private int customerId;
    private double balance;
    public Accounts() {
    }
    public Accounts(int accountId, int customerId, double balance) {
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }
<<<<<<< HEAD
    public Customers getCustomer() {
        return customer;
    }
    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
=======
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
        this.accountId = accountId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public int compareTo(Accounts o) {
        // TODO Auto-generated method stub
        return Double.compare(this.getBalance(), o.getBalance());
    } 
   
    
}