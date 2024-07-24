package com.ust.Bank.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {

    public int subid;
    public String name;
    public int age;
    public String email;
    public String phoneno;
    public String paymentmethod;
    public int platformid;
    public int paymentid;
}
