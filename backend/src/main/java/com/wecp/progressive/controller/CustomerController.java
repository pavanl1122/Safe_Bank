// package com.wecp.progressive.controller;

// import com.wecp.progressive.entity.Customers;
// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.service.CustomerService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.sql.SQLException;
// import java.util.List;

// @RestController
// @RequestMapping("/customers")
// public class CustomerController {

//     @Autowired
//     private CustomerService customerService;

//     // GET /customers
//     @GetMapping
//     public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException {
//         List<Customers> customers = customerService.getAllCustomers();
//         return new ResponseEntity<>(customers, HttpStatus.OK);
//     }

//     // GET /customers/{customerId}
//     @GetMapping("/{customerId}")
//     public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException {
//         Customers customer = customerService.getCustomerById(customerId);
//         return customer != null ? new ResponseEntity<>(customer, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//     }

//     // POST /customers
//     @PostMapping
//     public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException {
//         int id = customerService.addCustomer(customers);
//         return new ResponseEntity<>(id, HttpStatus.CREATED);
//     }

//     // PUT /customers/{customerId}
//     @PutMapping("/{customerId}")
//     public ResponseEntity<Void> updateCustomer(@PathVariable int customerId, @RequestBody Customers customers) throws SQLException {
//         customers.setCustomerId(customerId);
//         customerService.updateCustomer(customers);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     // DELETE /customers/{customerId}
//     @DeleteMapping("/{customerId}")
//     public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) throws SQLException {
//         customerService.deleteCustomer(customerId);
//         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//     }

//     // GET /customers/fromArrayList
//     @GetMapping("/fromArrayList")
//     public ResponseEntity<List<Customers>> getAllCustomersFromArrayList() {
//         return new ResponseEntity<>(HttpStatus.OK);
//     }

//     // GET /customers/fromArrayList/all
//     @GetMapping("/fromArrayList/all")
//     public ResponseEntity<List<Customers>> getAllCustomersSortedByNameFromArrayList() throws SQLException {
//         List<Customers> sortedCustomers = customerService.getAllCustomersSortedByName();
//         return new ResponseEntity<>(sortedCustomers, HttpStatus.OK);
//     }

//     // POST /customers/toArrayList
//     @PostMapping("/toArrayList")
//     public ResponseEntity<Integer> addCustomersToArrayList(@RequestBody Customers customers) {
//         return new ResponseEntity<>(HttpStatus.CREATED);
//     }

//     // GET /customers/{customerId}/transactions
//     @GetMapping("/{customerId}/transactions")
//     public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(@PathVariable int customerId) {
//         return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
//     }
// }


package com.wecp.progressive.controller;
 
 
import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerService;
import com.wecp.progressive.service.impl.CustomerServiceImplArraylist;
import com.wecp.progressive.service.impl.CustomerServiceImplJpa;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerServiceImplJpa customerServiceImplJpa;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerServiceImplArraylist customerServiceImplArraylist;
    @GetMapping("")
    public List<Customers> getAllCustomers() throws SQLException {
        return customerServiceImplArraylist.getAllCustomers();
    }
    @GetMapping("/{customerId}")
    public Customers getCustomerById(@PathVariable int customerId) throws SQLException{
        return customerServiceImplArraylist.getCustomerById(customerId);
    }
    // @PostMapping("")
    // public ResponseEntity<?> addCustomer(Customers customers) throws SQLException{
    //     //return -1;
    //     return new ResponseEntity<>(customerService.addCustomer(customers), HttpStatus.CREATED);
 
    // }
    @PostMapping
    public int addCustomer(Customers customers) throws SQLException
    {
        customerServiceImplArraylist.addCustomer(customers);
        return customers.getCustomerId();
    }
    @PutMapping("/{customerId}")
    public void updateCustomer(@PathVariable int customerId, @RequestBody Customers customers) throws SQLException{
        //return null;
        customerServiceImplArraylist.updateCustomer(customers);
    }
    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable int customerId) throws SQLException{
        //return null;
        customerServiceImplArraylist.deleteCustomer(customerId);
    }
    @GetMapping("/fromArrayList")
    public List<Customers> getAllCustomersFromArrayList() throws SQLException{
        return customerServiceImplArraylist.getAllCustomers();
    }
    @GetMapping("/fromArrayList/all")
    public List<Customers> getAllCustomersSortedByNameFromArrayList() throws SQLException
    {
        return customerServiceImplArraylist.getAllCustomersSortedByName();
    }
    // POST /customers/toArrayList
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addCustomersToArrayList(@RequestBody Customers customers) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
 
 