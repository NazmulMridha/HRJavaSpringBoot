package com.example.demo2.controller;

import com.example.demo2.Service.CustomerService;
import com.example.demo2.model.ComputerOperator;
import com.example.demo2.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last) {
        customerService.addCustomer(first,last);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Customer> getCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable Integer id) {

        return customerService.findCustomerById(id);
    }

    @GetMapping("/colist")
    public List<ComputerOperator> getCOList() {
        return customerService.getAllCO();
    }
}
