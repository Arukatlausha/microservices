package com.ust.Bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BankDetails {
    @Id
    public int id;
    public String accountNumber;
    public String accountHolderName;
    public String accounttype;
    public int paymentid;
}
