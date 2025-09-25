package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;

public class AccountServiceImpl implements AccountService{

    private AccountDAO accountDAO;
    private static List<Accounts> accountList = new ArrayList<>();

    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        return accountDAO.addAccount(accounts);
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        return accountDAO.getAccountById(accountId);
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        // return null;//AccountService.super.getAccountsByUser(userId);
        
        List<Accounts> allAccounts = accountDAO.getAllAccounts();
        List<Accounts> userAccounts = new ArrayList<>();
        for (Accounts account : allAccounts) {
            if (account.getCustomerId() == userId) {
                userAccounts.add(account);
            }
        }
        return userAccounts;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
        return accountDAO.getAllAccounts();
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
        // return new ArrayList<>();
        
        List<Accounts> accounts = accountDAO.getAllAccounts();
        accounts.sort(Comparator.comparingDouble(Accounts::getBalance));
        return accounts;

    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        //AccountService.super.deleteAccount(accountId);
        accountDAO.deleteAccount(accountId);
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        //AccountService.super.updateAccount(accounts);
        accountDAO.updateAccount(accounts);
    }
    
    

}