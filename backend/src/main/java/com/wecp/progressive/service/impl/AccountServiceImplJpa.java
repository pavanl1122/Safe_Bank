package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;
import com.wecp.progressive.service.AccountService;
@Service
public class AccountServiceImplJpa implements AccountService{
    
    private AccountRepository accountRepository; 
    
    public AccountServiceImplJpa(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
<<<<<<< HEAD
        accountRepository.save(accounts);
        return accounts.getAccountId();
        //return -1;
=======
       // accountRepository.save(accounts);
        //return accounts.getAccountId();
        return -1;
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        //AccountService.super.deleteAccount(accountId);
<<<<<<< HEAD
        accountRepository.deleteacc(accountId);
=======
        //accountRepository.deleteById(accountId);
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
<<<<<<< HEAD
        if(accountRepository.findById(accountId).isPresent())
        return accountRepository.findById(accountId).get();
=======
        //return accountRepository.findById(accountId).get();
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
        return null;
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
       // return AccountService.super.getAccountsByUser(userId);
<<<<<<< HEAD
       return accountRepository.getAccountsByCustomerCustomerId(userId);
        //return null;
=======
        return null;
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
<<<<<<< HEAD
        return accountRepository.findAll();
        //return null;
=======
        //return accountRepository.findAll();
        return null;
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
<<<<<<< HEAD
         List<Accounts> ls = accountRepository.findAll();
         Collections.sort(ls);
         return ls;
        
=======
        // List<Accounts> ls = accountRepository.findAll();
        // Collections.sort(ls);
        // return ls;
        return null;
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        //AccountService.super.updateAccount(accounts);
<<<<<<< HEAD
        accountRepository.save(accounts);
=======
        //accountRepository.save(accounts);
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }
    
    
}