package com.ust.Platformss.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
    public  int platformid;
    public String platformname;
    public String platformdescription;
    public String platformowner;
    public String platformplans;
    public List<Customers> customers;

}
