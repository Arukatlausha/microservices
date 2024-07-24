package com.ust.subscribers.repository;

import com.ust.subscribers.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customers,Integer> {
    Optional<Customers> getByEmail(String email);
List<Customers> getByPlatformid(int platformid);
List<Customers> getByPaymentid(int paymentid);
}
