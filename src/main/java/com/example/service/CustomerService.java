package com.example.service;

import com.example.entity.Customer;
import com.example.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public Customer registration(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer getCustomerById(Integer id){
        return customerRepo.findById(id).get();
    }

    public Customer getCustomerByUsername(String name){
        return customerRepo.findByUserName(name);
    }

    public Customer update(Customer customer){
        return customerRepo.save(customer);
    }

    public boolean login(String username, String password){
        Customer customer = getCustomerByUsername(username);
        return  customer != null ? customer.getPassword().equals(password) : false;
    }
}
