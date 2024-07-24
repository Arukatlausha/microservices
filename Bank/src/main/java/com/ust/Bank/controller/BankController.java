package com.ust.Bank.controller;

import com.ust.Bank.client.FullResponse;
import com.ust.Bank.client.Customers;
import com.ust.Bank.feigenclient.CustomerClient;
import com.ust.Bank.model.BankDetails;
import com.ust.Bank.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/accounts")
public class BankController {
    @Autowired
    private BankRepository bankRepository;
    @Autowired
    private CustomerClient customerClient;
    @PostMapping("/create")
    public BankDetails addBank(@RequestBody BankDetails bankDetails)
    {
        return bankRepository.save(bankDetails);
    }
    @GetMapping("/customers/{paymentid}")
    public FullResponse getBankDetailsByPaymentId(@PathVariable int paymentid)
        {
BankDetails bankDetails = bankRepository.findByPaymentid(paymentid).orElse(null);
List<Customers> c=customerClient.findCustomerByPaymentid(paymentid);
FullResponse fr=new FullResponse();
fr.setId(bankDetails.getId());
    fr.setAccountNumber(bankDetails.getAccountNumber());
    fr.setAccountHolderName(bankDetails.getAccountHolderName());
        fr.setAccounttype(bankDetails.getAccounttype());
        fr.setPaymentid(bankDetails.getPaymentid());
        fr.setCustomers(c);
        return fr;

        }
}
