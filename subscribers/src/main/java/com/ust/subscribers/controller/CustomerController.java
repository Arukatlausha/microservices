package com.ust.subscribers.controller;

import com.ust.subscribers.dto.Customersdto;
import com.ust.subscribers.model.Customers;
import com.ust.subscribers.repository.CustomerRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")


public class CustomerController {
    @Autowired
    public CustomerRepository customerRepository;
    //method to get all customers
    @PostMapping("/addcustomers")
    public Customers addCustomer(@RequestBody @Valid Customers customers) {
      return customerRepository.save(customers);

    }
    @GetMapping("/allcustomers")
    public List<Customers> getAllCustomers() {
        return customerRepository.findAll();
    }
    @GetMapping("/getbyemail/{email}")
    public Optional<Customers> getByEmail(@PathVariable String email) {
        return customerRepository.getByEmail(email);
    }
    @GetMapping("/platform/{platformid}")
    public List<Customers> getByPlatformId(@PathVariable int platformid)
    {
        return customerRepository.getByPlatformid(platformid);
    }
    @GetMapping("/bank/{paymentid}")
    public List<Customers> getByPaymentid(@PathVariable int paymentid)
    {
        return customerRepository.getByPaymentid(paymentid);
    }

}
