package com.ust.subscribers.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customersdto {
    public int subid;
    @NotEmpty(message = "name should be not empty")
    @NotNull(message = "name cannot be null")
    public String name;
    public int age;
    public String email;
    public String phoneno;
    public String paymentmethod;
}
