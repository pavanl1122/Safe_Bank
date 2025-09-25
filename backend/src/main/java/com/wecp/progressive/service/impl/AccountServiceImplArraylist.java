package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.AccountService;

public class AccountServiceImplArraylist implements AccountService{

private static List<Accounts> accountsList = new ArrayList<>();



@Override
public int addAccount(Accounts accounts) throws SQLException {
    // TODO Auto-generated method stub
    accountsList.add(accounts);
    return accountsList.size();
}

@Override
public List<Accounts> getAllAccounts() throws SQLException {
    // TODO Auto-generated method stub
    return accountsList;
}

@Override
public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
    // TODO Auto-generated method stub
    List<Accounts> sortedAccounts = accountsList;
        sortedAccounts.sort(Comparator.comparingDouble(Accounts::getBalance));
        return sortedAccounts;
}

@Override
public void emptyArrayList() {
    // TODO Auto-generated method stub
    // AccountService.super.emptyArrayList();
    accountsList = new ArrayList<>();
}

    
}