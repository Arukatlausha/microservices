package com.ust.Bank.repository;

import com.ust.Bank.model.BankDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<BankDetails,Integer> {
    Optional<BankDetails> findByPaymentid(int paymentid);
}
