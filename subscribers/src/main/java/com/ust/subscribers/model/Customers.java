package com.ust.subscribers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customers {
    @Id
  public int subid;
    public String name;
    public int age;
    public String email;
    public String phoneno;
    public String paymentmethod;
    public  int platformid;
    public int paymentid;
}
