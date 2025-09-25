package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

=======
import java.util.Comparator;
import java.util.List;
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252
import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{

<<<<<<< HEAD
    @Autowired
    private CustomerDAO customerDAO;
    public static List<Customers> arrayList = new ArrayList<>();
=======
    private CustomerDAO customerDAO;
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
    List<Customers> ls =new ArrayList<>(); 
    @Override
    public int addCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        return customerDAO.addCustomer(customers);
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        // TODO Auto-generated method stub
        return customerDAO.getAllCustomers();
    }

<<<<<<< HEAD
    // @Override
    // public List<Customers> getAllCustomersSortedByName() throws SQLException {
    //     // TODO Auto-generated method stub
        
    //     List<Customers> customers = customerDAO.getAllCustomers();
    //     // customers.sort(Comparator.comparing(Customers::getName));
    //     Collections.sort(customers);
    //     return customers;

    // }
    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> customers = customerDAO.getAllCustomers();
        if (customers == null) {
            customers = new ArrayList<>();
        }
        Collections.sort(customers); // Assumes Customers implements Comparable
        return customers;
}

=======
    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        
        List<Customers> customers = customerDAO.getAllCustomers();
        customers.sort(Comparator.comparing(Customers::getName));
        return customers;

    }
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        //CustomerService.super.updateCustomer(customers);
        customerDAO.updateCustomer(customers);
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        //CustomerService.super.deleteCustomer(customerId);
        customerDAO.deleteCustomer(customerId);
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        return customerDAO.getCustomerById(customerId);
    }

}