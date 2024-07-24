package com.ust.Bank.feigenclient;

import com.ust.Bank.client.Customers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name="subscribers",url="http://localhost:9091/customers")

public interface CustomerClient {
    @GetMapping("/bank/{paymentid}")
    List<Customers> findCustomerByPaymentid(@PathVariable int paymentid);

}
