package com.ust.Bank.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public int id;
    public String accountNumber;
    public String accountHolderName;
    public String accounttype;
    public int paymentid;
    public List<Customers> customers;
}
