package com.example.demo2.Service;

import com.example.demo2.model.ComputerOperator;
import com.example.demo2.model.Customer;
import com.example.demo2.repository.ComputerOperatorRepository;
import com.example.demo2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ComputerOperatorRepository computerOperatorRepository;

    /*
    Get all customer information.
     */
    public List<Customer> getAllCustomer (){
        return customerRepository.findAll();
    }

    /*
     Add Customer information
  */
    public void addCustomer (String firstName, String lastName){
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customerRepository.save(customer);
    }

    public Customer findCustomerById (Integer id){
       return customerRepository.findCustomerById(id);
    }

    /*
 Get all customer information.
  */
    public List<ComputerOperator> getAllCO (){
        return computerOperatorRepository.findAll();
    }
}
