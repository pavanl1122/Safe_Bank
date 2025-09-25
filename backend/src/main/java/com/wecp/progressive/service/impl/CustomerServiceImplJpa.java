package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;
import com.wecp.progressive.service.CustomerService;

@Service
public class CustomerServiceImplJpa implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return customerRepository.findAll();
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        Customers savedCustomer = customerRepository.save(customers);
        return savedCustomer.getCustomerId();
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        List<Customers> customers = customerRepository.findAll();
        return customers.stream()
                .sorted(Comparator.comparing(Customers::getName))
                .collect(Collectors.toList());
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        customerRepository.save(customers); // save() updates if ID exists
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        Optional<Customers> customer = customerRepository.findById(customerId);
        return customer.orElse(null);
    }
}
=======
public class CustomerServiceImplJpa {
    
}
>>>>>>> 75df51bc61bba2d874956097baa3415a2f066252
