package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.service.impl.AccountServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    private final AccountServiceImplJpa accountServiceImplJpa;
    

    public AccountController(AccountServiceImplJpa accountServiceImplJpa) {
        this.accountServiceImplJpa = accountServiceImplJpa;
    }

    

    @GetMapping
    public ResponseEntity<List<Accounts>> getAllAccounts() throws SQLException {
        return new ResponseEntity<>(accountServiceImplJpa.getAllAccounts(), HttpStatus.OK);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable int accountId) throws SQLException {
        return new ResponseEntity<>(accountServiceImplJpa.getAccountById(accountId), HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Accounts>> getAccountsByUser(@PathVariable int userId) throws SQLException {
        return new ResponseEntity<>(accountServiceImplJpa.getAccountsByUser(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addAccount(@RequestBody Accounts accounts) throws SQLException {
        return new ResponseEntity<>(accountServiceImplJpa.addAccount(accounts), HttpStatus.CREATED);
<<<<<<< HEAD
        //return -1;
=======
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @PutMapping("/{accountId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateAccount(@PathVariable int accountId, @RequestBody Accounts accounts) throws SQLException {
<<<<<<< HEAD
       // accounts.setAccountId(accountId);
        //accountServiceImplJpa.updateAccount(accounts);
=======
        accounts.setAccountId(accountId);
        accountServiceImplJpa.updateAccount(accounts);
>>>>>>> a6db26c2bafe6b79327632db79438ca36cd2e321
    }

    @DeleteMapping("/{accountId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteAccount(int accountId) throws SQLException {
        //accountServiceImplJpa.deleteAccount(accountId);
    }
}